package com.techelevator.dao;

import com.techelevator.model.Park;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcParkDao implements ParkDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcParkDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Park getPark(long parkId) {
        String sql = "SELECT * FROM park WHERE park_id = ?";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, parkId);

        Park park = null;
        // If we want to use a SqlRowSet but only want one row, we can use if rather than
        // while - if there is data the code will be executed once but will not loop after that
        if (result.next()) {;
            park = mapRowToPark(result);
        }
        return park;
    }

    @Override
    public List<Park> getParksByState(String stateAbbreviation) {
        List<Park> parks = new ArrayList<Park>();

        String sql = "SELECT * FROM park p " +
                "JOIN park_state ps ON ps.park_id = p.park_id " +
                "WHERE ps.state_abbreviation = ?";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, stateAbbreviation);

        while(rowSet.next()) {
            Park newPark = mapRowToPark(rowSet);
            parks.add(newPark);
        }

        return parks;
    }

    @Override
    public Park createPark(Park park) {
        String sql = "INSERT INTO park (park_name, date_established, area, has_camping) VALUES " +
                "(?, ?, ?, ?) RETURNING park_id";

        Long parkId = jdbcTemplate.queryForObject(sql, Long.class, park.getParkName(),
                park.getDateEstablished(), park.getArea(), park.getHasCamping());

        park.setParkId(parkId);

        return park;
    }

    @Override
    public void updatePark(Park park) {
        String sql = "UPDATE park SET park_name = ?, date_established = ?, area = ?, has_camping = ? " +
                " WHERE park_id = ?";
        jdbcTemplate.update(sql, park.getParkName(), park.getDateEstablished(), park.getArea(),
                park.getHasCamping(), park.getParkId());
    }

    @Override
    public void deletePark(long parkId) {
        String sql = "DELETE FROM park WHERE park_id = ?";
        jdbcTemplate.update(sql, parkId);

    }

    @Override
    public void addParkToState(long parkId, String stateAbbreviation) {
        String sql = "INSERT INTO park_state (park_id, state_abbreviation) "
                + " VALUES (?, ?)";
        int count = jdbcTemplate.update(sql, parkId, stateAbbreviation);
        System.out.println(count);
    }

    @Override
    public void removeParkFromState(long parkId, String stateAbbreviation) {
        String sql = "DELETE FROM park_state WHERE park_id = ? AND state_abbreviation = ?";
        jdbcTemplate.update(sql, parkId, stateAbbreviation);

    }

    private Park mapRowToPark(SqlRowSet rowSet) {
        Park park = new Park();
        park.setParkId(rowSet.getLong("park_id"));
        park.setParkName(rowSet.getString("park_name"));
        park.setDateEstablished(rowSet.getDate("date_established").toLocalDate());
        park.setHasCamping(rowSet.getBoolean("has_camping"));
        park.setArea(rowSet.getDouble("area"));
        return park;
    }
}
