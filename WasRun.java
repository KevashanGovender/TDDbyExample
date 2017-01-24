/**
 * Created by kevashan on 2017/01/24.
 */
public class WasRun extends TestCase{


    public String log;

    public WasRun(String name){

        super(name);

    }

    public void testMethod(){

        log = log + "testMethod ";
    }

    public void setUp(){

        log = "setUp ";
    }

    public void tearDown(){

        log = log + "tearDown ";
    }

    public void testBrokenMethod(){

        throw new NullPointerException();
    }

    public void run(TestResult result) {

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
    }

}
