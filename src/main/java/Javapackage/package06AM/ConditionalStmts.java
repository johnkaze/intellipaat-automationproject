package Javapackage.package06AM;

public class ConditionalStmts {
	/*
	 *Conditional Statements :: 
	 *
	 * 1. if :: only one condition
	 * 2. else if :: Multiple conditions
	 * 3. switch case :: Multiple conditions and expression
	 * 
	 */

	void ifStatement() {
		int m = 45;
		if (m < 40) {
			System.out.println("The student is failed");
		} else {
			System.out.println("The student is passed");
		}
	}

	void elseIfStatement() {
		int m = 99;
		if (m < 40) {
			System.out.println("The student is failed");
		} else if (m >= 40 & m < 60) {
			System.out.println("The student is passed with grade C");
		} else if (m >= 60 & m < 80) {
			System.out.println("The student is passed with grade B");
		} else {
			System.out.println("The student is passed with grade A");
		}
	}

	void switchCaseStatement() {

		String week = "Monday";
		
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
		default :
			System.out.println("Sunday");
			
		}
		
		System.out.println("Out of switch statement");

	}

	public static void main(String[] args) {
		ConditionalStmts obj = new ConditionalStmts();

		//obj.ifStatement();
		//obj.elseIfStatement();
		obj.switchCaseStatement();
	}

}
