import java.io.File;
import java.io.FileReader;

public class ExceptionEx6 {

    public static void main(String args[]) {

        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
}

