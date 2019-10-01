package Javapackage.package08am;

public class CustomException extends Exception {
    public CustomException() {
        throw new ArrayIndexOutOfBoundsException("Trying to enter data more than specified size of array");
    }
}
