package exception;

import java.io.IOException;

public class AnimalExceptionHandler extends IOException {
    public AnimalExceptionHandler(String message) {
        super(message);
    }
}
