package Javapackage.navathapackage;

public class ConditionalStmts {
	
	static void ifCondition(int marks) {
		
		if( marks >= 40 ) {
			System.out.println("Student is passed and marks are :: "+marks);
		} else {
			System.out.println("Student is failed and marks are :: "+marks);
		}
		
	}

	static void elseIfCondition(int marks) {
		
		if(marks >= 40 && marks < 60) {
			System.out.println("Student is passed in grade C and marks are :: "+marks);
		} else if(marks >= 60 && marks < 80) {
			System.out.println("Student is passed in grade B and marks are :: "+marks);
		} else if(marks >= 80 && marks <= 100) {
			System.out.println("Student is passed in grade A and marks are :: "+marks);
		} else {
			System.out.println("Student is failed and marks are :: "+marks);
		}

	}
	
	static void switchCase(String week) {
		
		switch(week) {
		
		case "Sunday":
			System.out.println("Sunday");
			break;
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuseday":
			System.out.println("Tuseday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thurseday":
			System.out.println("Thurseday");
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
		
		System.out.println("out of switch case");
		
	}
	
	public static void main(String[] args) {
		//ifCondition(39);
		//elseIfCondition(39);
		switchCase("Satudgdfgdsfgsdfgfdsgsrday");
	}
	
}
