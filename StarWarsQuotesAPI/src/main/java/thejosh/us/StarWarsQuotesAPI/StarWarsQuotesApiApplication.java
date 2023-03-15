package thejosh.us.StarWarsQuotesAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import thejosh.us.StarWarsQuotesAPI.controllers.QuoteBuilder;
import thejosh.us.StarWarsQuotesAPI.repository.QuoteRepository;

@SpringBootApplication
@EnableMongoRepositories
public class StarWarsQuotesApiApplication implements CommandLineRunner {

	@Autowired
	QuoteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StarWarsQuotesApiApplication.class, args);
	}

	@Override
	public void run(String... args)  {
		QuoteBuilder quoteBuilder = new QuoteBuilder(repository);
		quoteBuilder.generateDB();
	}
}
