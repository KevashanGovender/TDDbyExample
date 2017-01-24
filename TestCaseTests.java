import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kevashan on 2017/01/24.
 */
public class TestCaseTests {

    TestResult result = new TestResult();

    @Test
    public void testTemplateMethod(){

        WasRun test = new WasRun("testMethod");
        test.run();
        assert("setUp testMethod tearDown ".equals(test.log));
    }

    @Test
    public void testResult(){

        WasRun test = new WasRun("testMethod");
        result = test.run();
        assert("1 run, 0 failed".equals(result.summary()));
    }

    @Test
    public void testFailedResult(){

        WasRun test = new WasRun("testBrokenMethod");
        result = test.run();
        assert("1 run, 1 failed".equals(result.summary()));
    }

    @Test
    public void testFailedResultFormatting(){

        result.testStarted();
        result.testFailed();
        assert("1 run, 1 failed".equals(result.summary()));
    }

    @Test
    public void testSuite(){

        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        System.out.println(result.summary());
        assert("2 run, 1 failed".equals(result.summary()));
    }

}
