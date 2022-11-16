package com.sincere.springh2demo;

import com.sincere.springh2demo.pojo.Book;
import com.sincere.springh2demo.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringH2DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringH2DemoApplication.class, args);
		//ConfigurableApplicationContext context = SpringApplication.run(SpringH2DemoApplication.class, args);
		//Object dataSource = context.getBean("dataSource");
		//System.out.println(dataSource);
	}

	//functional interface , after the application context has been created and before the application actually run.
	@Bean
	CommandLineRunner commandLineRunner(BookRepository repository) {
		return args -> {
			repository.save(new Book(null, "sanguo", 999, "luoguanzhong"));
		};
	}
}
