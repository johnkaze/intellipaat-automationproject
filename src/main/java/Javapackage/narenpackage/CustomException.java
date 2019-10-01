package Javapackage.narenpackage;

public class CustomException extends Exception {

    public CustomException(String message) {
        throw new ArrayIndexOutOfBoundsException(message);
    }

}
