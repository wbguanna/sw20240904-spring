package com.example.demo.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {

	private static final Logger logger = LogManager.getLogger(UserTest.class);
	private User user;
	
	public UserTest() {
		this.user = new User("1001", "KIM", "kim@example.com");
	}
	
	@BeforeAll
	public void setUpBeforeClass() {
		assertTrue(user != null);
		System.out.println("BeforeAll ...");
		logger.info("BeforeAll ...");
	}
	@AfterAll
	public void setUpAfterClass() {

		System.out.println("@AfterAll ...");
		logger.info("@AfterAll ...");
	}
	@AfterEach
	public void setUp() {

		System.out.println("@AfterEach ...");
		logger.info("@AfterEach ...");
	}
	@BeforeEach
	public void tearDown() {

		System.out.println("@BeforeEach ...");
		logger.info("@BeforeEach ...");
	}
	
	
	@Test
	void testToString() {
		System.out.println(user);
	}
	
	@Test
	public void testIsValid() {
		User userDTO = new User();
		user.setName("john_doe");
		userDTO.setEmail("john@example.com");

		if (userDTO.isValid()) {
			logger.info("UserDTO is valid");
		} else {
			logger.error("UserDTO is not valid");
		}
	}
	

    @Test
    public void testIsValid2() {
        User user = new User();
        user.setName("john_doe");
        user.setEmail("john@example.com");

        assertTrue(user.isValid());
    }
}
