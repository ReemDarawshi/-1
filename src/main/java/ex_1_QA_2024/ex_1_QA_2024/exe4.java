package ex_1_QA_2024.ex_1_QA_2024;

public class exe4 {
	
	public static String calculate (double a , double b, String mode) {
		
		switch (mode.toLowerCase()) {
		            case "regular":
		                if (a > b) {
		                    return "A";
		                } else {
		                    return "B";
		                }

		            case "negative":
		                if (-a > -b) {
		                    return "A";
		                } else {
		                    return "B";
		                }

		            case "inverse":
		                if (a == 0 || b == 0) {
		                    return "Error: Division by zero";
		                }
		                if (1.0 / a > 1.0 / b) {
		                    return "A";
		                } else {
		                    return "B";
		                }

		            default:
		                return "Error: Invalid mode";
		        }
		    }

	
		}


