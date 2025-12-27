package com.yuvi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.yuvi.service.ICustomerManagementService;

@SpringBootApplication
public class Bp16JpaRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Bp16JpaRepositoryApplication.class, args);
		ICustomerManagementService service  = ctx.getBean(ICustomerManagementService.class);
			System.out.println("---------------------------------------");
			try{
				System.out.println(service.searchMovieById(6));
				
 			}catch(Exception e) {
				e.printStackTrace();
			}
	}

}
