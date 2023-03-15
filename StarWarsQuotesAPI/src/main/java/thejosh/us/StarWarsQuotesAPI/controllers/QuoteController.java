package thejosh.us.StarWarsQuotesAPI.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import thejosh.us.StarWarsQuotesAPI.model.Quote;
import thejosh.us.StarWarsQuotesAPI.repository.QuoteRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuoteController.class);


    private final QuoteRepository repository;

    public QuoteController(QuoteRepository repository){
        this.repository = repository;
    }

    @GetMapping("/api/all")
    public List<Quote> getAllQuotes(){
        LOGGER.info("Getting all quotes\n");
        for (Quote quote : repository.findAll()){
            LOGGER.info(""+quote);
        }

        return repository.findAll();
    }

    @PostMapping("/api/character")
    public Quote getQuoteByCharacter(@RequestHeader String character){
        List<Quote> characterQuotes = new ArrayList<>(repository.findByCharacter(character));
        int numberOfCharacterQuotes = characterQuotes.size();
        Random rand = new Random();
        int randInt = rand.nextInt(numberOfCharacterQuotes);

        LOGGER.info("Getting quote for character: " + character + " :" + characterQuotes.get(randInt));

        return characterQuotes.get(randInt);
    }

    @PostMapping("/api/movie")
    public Quote getQuoteByMovie(@RequestHeader String movie){
        List<Quote> movieQuotes = new ArrayList<>(repository.findByMovie(movie));
        int numberOfMovieQuotes = movieQuotes.size();
        Random rand = new Random();
        int randInt = rand.nextInt(numberOfMovieQuotes);

        LOGGER.info("Getting quote for movie: " + movie + " :" + movieQuotes.get(randInt));

        return movieQuotes.get(randInt);
    }

    @GetMapping("/api/random")
    public Quote getRandomQuote(){
        long numberOfQuotes = repository.count();
        List<Quote> allQuotes = new ArrayList<>(repository.findAll());
        Random rand = new Random();
        long randLong = rand.nextLong(numberOfQuotes);

        LOGGER.info("Getting random quote: " + allQuotes.get((int) randLong));

        return allQuotes.get((int) randLong);
    }

}


