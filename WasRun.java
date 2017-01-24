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

}
