package coffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import co.grandcircus1.coffeeshopdemo.BakeryItem;

@Repository
public class BakeryItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<BakeryItem>findAll() {
		return jdbcTemplate.query( "Select * FROM Room", new BeanPropertyRowMapper<>(BakeryItem.class));
	}
	
	
}
