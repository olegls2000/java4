package model;

public class ExceptionExperiment {
    Number throwExc() throws Exception {
        if (1 !=2){
            throw new Exception();
        }
        return 9;
    }
}
