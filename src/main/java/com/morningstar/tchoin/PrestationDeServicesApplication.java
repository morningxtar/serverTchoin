package com.morningstar.tchoin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class PrestationDeServicesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(PrestationDeServicesApplication.class, args);
    }

    @Override
    public void run(String... args) throws SQLException {


    }
}
