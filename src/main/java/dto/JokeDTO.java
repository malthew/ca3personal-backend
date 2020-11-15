package dto;
import entities.Joke;
import entities.Joke;
/**
 *
 * @author Rasmus
 */
public class JokeDTO {
    private String theJoke;
    private String type;
    private String reference;
    
    
    public JokeDTO(Joke joke) {
        this.theJoke = joke.getTheJoke();
        this.reference = joke.getReference();
        this.type = joke.getType();
    }

    @Override
    public String toString() {
        return "JokeDTO{" + ", theJoke=" + theJoke + ", type=" + type + ", reference=" + reference + '}';
    }

    public String getTheJoke() {
        return theJoke;
    }

    public void setTheJoke(String theJoke) {
        this.theJoke = theJoke;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    
    
}
