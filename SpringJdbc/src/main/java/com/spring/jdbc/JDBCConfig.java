package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//import com.spring.jdbc.dao.StudentDao;
//import com.spring.jdbc.dao.StudentDaoimpl;

@Configuration
@ComponentScan("com")
public class JDBCConfig {

	/*
	 * In XML as <bean
	 * class="org.springframework.jdbc.datasource.DriverManagerDataSource"
	 * name="ds"> <property name="driverClassName"
	 * value="org.postgresql.Driver"></property> <property name="url"
	 * value="jdbc:postgresql://localhost/springjdbc"></property> <property
	 * name="username" value="postgres"></property> <property name="password"
	 * value="Exact@167"></property> </bean>
	 */

	@Bean(name = { "ds" })
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost/springjdbc");
		ds.setUsername("postgres");
		ds.setPassword("Exact@167");
		return ds;

	}

	/*
	 * 
	 * <bean class="org.springframework.jdbc.core.JdbcTemplate" name="jdbcTemplate">
	 * <property name="dataSource"> <ref bean="ds" /> </property> </bean>
	 */

	@Bean(name = { "jdbcTemplate" })
	public JdbcTemplate getTemplate() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}

	/*
	 * <bean class="com.spring.jdbc.dao.StudentDaoimpl" name="dao"> <property
	 * name="jdbcTemplate" ref="jdbcTemplate"></property> </bean>
	 */
	/*
	 * To autowire add @Component in StudentImpl class add @Autowired in JDBC
	 * TEMPLate add @ComponentScan("com") in config file without autowiring remove
	 * all annotation stated above and write as below mentioned
	 * 
	 * @Bean(name={"dao"}) public StudentDao getStudentDao() {
	 * 
	 * StudentDaoimpl dao= new StudentDaoimpl(); dao.setJdbcTemplate(getTemplate());
	 * return dao; }
	 */

}
