package com.ap08.AP08;

import java.security.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Ap08Application implements CommandLineRunner {

  @Autowired
	  JdbcTemplate jdbcTemplate;


	public static void main(String[] args) {
		SpringApplication.run(Ap08Application.class, args);
	}


	@Override
	
	 public void run(String... args) throws Exception {
	        jdbcTemplate.query("SELECT id, actif, compte_creation, compte_maj, date_creation, date_maj, nom_arabe, nom_latin, nom_tamazight FROM wilaya",
	                (rs, rowNum) -> new Wilaya(rs.getLong("id"), rs.getBoolean("actif"), rs.getLong("compte_creation"),
	                        rs.getLong("compte_maj"), rs.getTimestamp("date_creation"), rs.getTimestamp("date_maj"),
	                        rs.getString("nom_arabe"), rs.getString("nom_latin"), rs.getString("nom_tamazight"))
	        ).forEach(wil -> System.out.println(wil));
	    }

}
