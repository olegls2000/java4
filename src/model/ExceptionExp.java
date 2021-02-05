package model;

public class ExceptionExp {
    Number throwException() throws Exception
    {
        if (1 != 2)
        {
            throw new Exception();
        }
        return 9;
    }
}
