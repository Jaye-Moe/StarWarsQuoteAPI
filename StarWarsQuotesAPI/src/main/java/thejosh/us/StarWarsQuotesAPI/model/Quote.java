package thejosh.us.StarWarsQuotesAPI.model;

import org.springframework.data.annotation.Id;

public class Quote {

    @Id
    public String id;

    public String quoteText;
    public String character;
    public String movie;

    public Quote(String quoteText, String character, String movie){
        this.quoteText=quoteText;
        this.character=character;
        this.movie=movie;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", quoteText='" + quoteText + '\'' +
                ", character='" + character + '\'' +
                ", movie='" + movie + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuoteText() {
        return quoteText;
    }

    public void setQuoteText(String quoteText) {
        this.quoteText = quoteText;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
}
