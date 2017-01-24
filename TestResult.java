/**
 * Created by kevashan on 2017/01/24.
 */
public class TestResult {

    private int runCount;
    private int errorCount;

    public TestResult(){

        runCount = 0;
        errorCount = 0;
    }

    public void testStarted(){

        runCount = runCount + 1;
    }

    public void testFailed(){

        errorCount = errorCount + 1;
    }

    public String summary(){

        return runCount + " run, " + errorCount + " failed";
    }
}
