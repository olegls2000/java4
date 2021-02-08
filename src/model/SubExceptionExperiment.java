package model;

public class SubExceptionExperiment extends ExceptionExperiment {

    @Override
    public Integer throwExc() throws Exception {
        super.throwExc();
        return 0;
    }
}