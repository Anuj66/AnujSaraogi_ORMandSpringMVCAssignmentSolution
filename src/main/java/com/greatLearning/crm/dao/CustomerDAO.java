package com.greatLearning.crm.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.greatLearning.crm.dbconfig.DBConfig;
import com.greatLearning.crm.model.Customer;

@Repository
public class CustomerDAO {

	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> listCustomers() {
		jdbcTemplate = new JdbcTemplate(DBConfig.getDatabaseConnection());
		String query = "select * from customer";
		@SuppressWarnings("unchecked")
		List<Customer> customers = jdbcTemplate.query(query, new RowMapper() {
			public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				Customer customer = new Customer();
				customer.setFirstName(resultSet.getString("firstName"));
				customer.setLastName(resultSet.getString("lastName"));
				customer.setEmail(resultSet.getString("email"));
				return customer;
			}
		});
		return customers;
	}
	
}
