import java.util.NoSuchElementException;

/**
 * Created by kevashan on 2017/01/24.
 */
public class TestCase {

    public String name;

    public TestCase(String name){

        this.name = name;
    }

    public void testMethod(){

    }

    public void setUp(){

    }

    public void tearDown(){

    }

    public void testBrokenMethod(){

    }


    public TestResult run(){

        TestResult result = new TestResult();
        result.testStarted();
        setUp();
        try{

            if(name.equals("testMethod")){

                testMethod();
            }

            if(name.equals("testBrokenMethod")){

                testBrokenMethod();
            }
        }
        catch(NullPointerException e){

            result.testFailed();
        }

        tearDown();
        return result;
    }

}
