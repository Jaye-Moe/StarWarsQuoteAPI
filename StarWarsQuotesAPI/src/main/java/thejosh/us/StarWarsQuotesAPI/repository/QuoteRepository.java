package thejosh.us.StarWarsQuotesAPI.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import thejosh.us.StarWarsQuotesAPI.model.Quote;

import java.util.List;

public interface QuoteRepository extends MongoRepository<Quote, String> {

    public List<Quote> findByMovie(String movie);

    public List<Quote> findByCharacter(String character);



}
