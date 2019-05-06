package test;
import com.stackroute.pe2.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class testPalindromeRevGivenStringTrue {
    PalindromeRev pr=new PalindromeRev();
    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
    }

    @Test
    public void testpalcheck() {
        String s="malayalam";
        assertTrue("Refactor the code",pr.palcheck(s));
    }

}

