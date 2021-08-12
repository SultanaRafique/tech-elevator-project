package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()){
			employees.add(mapRowTOEmployee(results));
		}
		return employees;
	}


	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {

		if(firstNameSearch.isEmpty() && lastNameSearch.isEmpty() ){
			return getAllEmployees();
		}

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee WHERE ";
		SqlRowSet results = null;

		if (lastNameSearch.isEmpty()){

			sql = sql + " first_name ILIKE ? ";
			results = jdbcTemplate.queryForRowSet(sql, "%"+firstNameSearch+"%");


		} else if(firstNameSearch.isEmpty()){

			sql = sql + "  last_name ILIKE ?";
			results = jdbcTemplate.queryForRowSet(sql,"%"+lastNameSearch+"%");


		} else {

			sql = sql + " first_name ILIKE ? AND last_name ILIKE ?";
			results = jdbcTemplate.queryForRowSet(sql, "%"+firstNameSearch+"%", "%"+lastNameSearch+"%");
		}


		if(results != null) {
			while (results.next()) {
				employees.add(mapRowTOEmployee(results));
			}
		}

		return employees;

	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee WHERE employee_id IN (SELECT employee_id FROM project_employee WHERE project_id = ? )";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql, projectId);
		while(results.next()){
			employees.add(mapRowTOEmployee(results));
		}

		return employees;
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sql = "INSERT INTO project_employee(project_id, employee_id) VALUES" +
				"(?, ?)";

		 jdbcTemplate.update(sql, projectId, employeeId);

	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {
		String sql = "DELETE FROM project_employee WHERE project_id = ? AND employee_id = ?";
		jdbcTemplate.update(sql, projectId, employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {

		List<Employee> employees = new ArrayList<>();
		String sql = "SELECT * FROM employee WHERE employee_id NOT IN (SELECT employee_id FROM project_employee )";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()){
			employees.add(mapRowTOEmployee(results));
		}
		return employees;
	}

	private Employee mapRowTOEmployee(SqlRowSet rowSet){

		Employee employee = new Employee();
		employee.setId(rowSet.getLong("employee_id"));
		employee.setDepartmentId(rowSet.getLong("department_id"));
		employee.setFirstName(rowSet.getString("first_name"));
		employee.setLastName(rowSet.getString("last_name"));
		employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
		employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());

		return employee;
	}



}
