package ex_1_QA_2024.ex_1_QA_2024;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	exe4 test = new exe4();
	

    /**
     * Rigorous Test :-)
     */
    		 
	  @Test
	    public void Test_Positive1() {
	        String Expected_result = "A";
	        int a = 5, b = 3;
	        String mod = "regular";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_Positive2() {
	        String Expected_result = "A";
	        int a = -4, b = -6;
	        String mod = "regular";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_Negative() {
	        String Expected_result = "B";
	        int a = 3, b = 5;
	        String mod = "regular";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_NegativeComparison_Positive1() {
	        String Expected_result = "B";
	        int a = 3, b = -4;
	        String mod = "negative";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_NegativeComparison_Positive2() {
	        String Expected_result = "B";
	        int a = 7, b = -2;
	        String mod = "negative";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_NegativeComparison_Negative() {
	        String Expected_result = "A";
	        int a = -3, b = -8;
	        String mod = "negative";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_InverseComparison_Positive1() {
	        String Expected_result = "B";
	        int a = 2;
			double b = 0.5;
	        String mod = "inverse";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_InverseComparison_Positive2() {
	        String Expected_result = "A";
	        double a = 0.25;
			double b = 0.5;
	        String mod = "inverse";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }

	    @Test
	    public void Test_InverseComparison_Negative() {
	        String Expected_result = "B";
	        int a = 4, b = 2;
	        String mod = "inverse";
	        String actual_result = test.calculate(a, b, mod);
	        assertEquals(Expected_result, actual_result);
	    }
	}

