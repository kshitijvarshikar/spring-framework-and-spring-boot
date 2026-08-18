package in.strikes.Lecture11_crudSpringBootDemo.exception;

public class DuplicateResourceException extends RuntimeException{

    public DuplicateResourceException(String message){
        super(message);
    }
}
