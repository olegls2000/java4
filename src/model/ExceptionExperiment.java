package model;

public class ExceptionExperiment {
    Integer throwExc() throws Exception {
        if (1 != 2) {
            throw new Exception();
        }
        return 9;
    }
}