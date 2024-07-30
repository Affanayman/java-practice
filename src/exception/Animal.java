package exception;

import java.io.IOException;

public class Animal extends Object{
    public void sound() throws Exception  {
        throw new AnimalExceptionHandler("invalid sound");
    }
}
