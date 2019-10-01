package Javapackage.package09AM;

public class ConditionalStmts {
	/*
	 * Conditional Statements :: 
	 * 
	 * 1. if else :: when only one condition 
	 * 2. else if :: when we have multiple conditions.
	 * 3. switch case :: when we have multiple conditions and depends on some expression
	 * 
	 */
	
	void ifCondition() {
		
		String time = "6AM";
		
		if(time == "6AM") {
			
		} else if(time == "7AM") {
			
		} else if(time == "8AM") {
			
		}
		
		int m = 40;
		if(m < 40) {
			System.out.println("Student is failed");
		} else {
			System.out.println("Student is passed");
		}
	}
	
	void elseIfCondition() { // cyclomatic complexity = 4
		int m = 75;
		if(m < 40) {
			System.out.println("Student is failed");
		} 
		else if(m >= 40 && m < 60) {
			System.out.println("Student is passed with grade C");
		} 
		else if(m >= 60 && m < 80) {
			System.out.println("Student is passed with grade B");
		}
		else {
			System.out.println("Student is passed with grade A");
		}
	}
	
	void switchCase() {
		String week = "Saturday";
		
		switch(week) {
		
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday":
			System.out.println("Tuesday");
			break;
		case "Wendsday":
			System.out.println("Wendsday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default :
			System.out.println("Default is Sunday");
		
		}
		
		System.out.println("Out of switch");
		
	}
	
	public static void main(String[] args) {
		ConditionalStmts cs = new ConditionalStmts();
		//cs.ifCondition();
		cs.elseIfCondition();
		//cs.switchCase();
	}
	
	// cities, countries, 

}
