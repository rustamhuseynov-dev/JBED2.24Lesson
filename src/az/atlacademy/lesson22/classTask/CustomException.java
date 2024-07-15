package az.atlacademy.lesson22.classTask;

public class CustomException extends RuntimeException{

    String message;

    public CustomException(String message){
     super(message);
     this.message = message;
    }

    public CustomException(){

    }

    public CustomException(NumberFormatException c) {
    }
}
