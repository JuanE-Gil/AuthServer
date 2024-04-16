package pe.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import pe.company.enums.Rolename;
import pe.company.model.EntityRole;
import pe.company.repository.EntityRoleRepository;

@SpringBootApplication
public class AuthServerApplication   {
	



	public static void main(String[] args) {
		SpringApplication.run(AuthServerApplication.class, args);
	}



}
