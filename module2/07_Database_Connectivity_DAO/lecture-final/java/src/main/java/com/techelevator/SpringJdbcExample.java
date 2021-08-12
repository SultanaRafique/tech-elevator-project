package com.techelevator;

import com.techelevator.dao.JdbcParkDao;
import com.techelevator.dao.ParkDao;
import com.techelevator.model.Park;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class SpringJdbcExample {

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        listParks(jdbcTemplate);
//        printStateCount(jdbcTemplate);
//        printStateName(jdbcTemplate, "PA");
//        printOneState(jdbcTemplate, "PA");
        getPark(dataSource, 65);
    }

    public static void listParks(JdbcTemplate jdbcTemplate) {
        SqlRowSet parks = jdbcTemplate.queryForRowSet("SELECT park_id, park_name FROM park");

        while(parks.next()) {
            Long parkId = parks.getLong("park_id");
            String parkName = parks.getString("park_name");
            String parkIdString = parks.getString("park_id");
            System.out.println(String.format("id: %d  name: %s", parkId, parkName));
            System.out.println("parkIdString: " + parkIdString);
        }
    }

    public static void printStateCount(JdbcTemplate jdbcTemplate) {
        Integer count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM state", Integer.class);
        if (count != null) {
            System.out.println(String.format("State count: %d", count));
        }
    }

    public static void printOneState(JdbcTemplate jdbcTemplate, String stateAbbreviation) {
        String sql = "SELECT state_name FROM state WHERE state_abbreviation = ?";
        String stateName = jdbcTemplate.queryForObject(sql, String.class, stateAbbreviation);
        System.out.println(stateName);
    }

    public static void printStateName(JdbcTemplate jdbcTemplate, String stateCode) {
        String stateName = jdbcTemplate.queryForObject("SELECT state_name FROM state WHERE state_abbreviation = ?",
                String.class, stateCode);
        System.out.println(stateName);
    }

    public static void getPark(DataSource dataSource, long parkId) {
        ParkDao parkDao = new JdbcParkDao(dataSource);
        Park park = parkDao.getPark(parkId);
        if (park != null) {
            System.out.println(park.getParkName());
        } else {
            System.out.println("Null park");
        }
    }
}
