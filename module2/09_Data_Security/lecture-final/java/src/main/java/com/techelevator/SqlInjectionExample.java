package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.util.List;
import java.util.Scanner;

public class SqlInjectionExample {

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter cityId: ");
        String cityId = userInput.nextLine();

        // Concatenation
//        String sql = "SELECT population from CITY WHERE city_id = " + cityId;
        String sql = "SELECT population from CITY WHERE city_id = ?";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, Long.parseLong(cityId));

//        String sql = "SELECT population from CITY WHERE city_id = ?";
//        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sql, Long.parseLong(cityId));

        while (rowSet.next()) {
            System.out.println(rowSet.getInt("population"));
        }
    }
}
