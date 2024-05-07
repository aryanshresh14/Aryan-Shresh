 class UsernamePasswordMisMatchException extends RuntimeException {

    public UsernamePasswordMisMatchException(String message)
    {
        super(message);
    }

    
}

public class ThrowExample {

    public static void main(String[] args) throws Throwable
    {
        throw new UsernamePasswordMisMatchException("Username Password Mismatch Exception");
    }
    
}