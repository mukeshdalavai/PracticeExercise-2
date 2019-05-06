package test;
import com.stackroute.pe2.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenNumTestGivenaNumberTrue {
    EvenNumTest en=new EvenNumTest();
    @Before
    public void setup() {
       /* EvenNumTest en=new EvenNumTest();*/
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @After
    public void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
       /* en=null;*/
    }

    @Test
    public void testpalcheck() {
        int num=44;
        assertTrue("Refactor the code",en.isEven(num));
    }

}

