package dev.jviera.serviplus;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.IOException;

import static org.antlr.v4.runtime.misc.Utils.readFile;

@SpringBootApplication
public class ServiplusApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServiplusApplication.class, args);
	}
}
