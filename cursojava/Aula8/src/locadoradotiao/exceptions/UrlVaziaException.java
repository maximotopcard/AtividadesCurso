package locadoradotiao.exceptions;

public class UrlVaziaException extends RuntimeException {
    private final String messenger;
    public UrlVaziaException(String messenger) {
        this.messenger = messenger;
    }

    @Override
    public String getMessage(){
        return this.messenger;
    }
 

}

