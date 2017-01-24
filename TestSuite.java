import java.util.ArrayList;

/**
 * Created by kevashan on 2017/01/24.
 */
public class TestSuite {

    public ArrayList<WasRun> tests;

    public TestSuite(){

        tests = new ArrayList<WasRun>();
    }

    public void add(WasRun test){

        tests.add(test);
    }

    public TestResult run(TestResult result){

        for(int i = 0; i < tests.size(); i++){

            tests.get(i).run(result);
        }

        return result;

    }
}
