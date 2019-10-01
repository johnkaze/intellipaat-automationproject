package Javapackage.package08am;

public class ConditionalStmts {

    static void ifCondition() {

    int marks = m1(40);

        if (marks >= 40) {
            System.out.println("Student is passed and marks are :: " + marks);
        } else {
            System.out.println("Student is failed and marks are :: " + marks);
        }

    }

    static void elseIfCondition(int m) {

        if (m >= 40 && m < 60) {
            System.out.println("Student is passed in grade C and marks are :: " + m);
        } else if (m >= 60 && m < 80) {
            System.out.println("Student is passed in grade B and marks are :: " + m);
        } else if (m >= 80 && m <= 100) {
            System.out.println("Student is passed in grade A and marks are :: " + m);
        } else {
            System.out.println("Student is failed and marks are :: " + m);
        }

    }

    static void switchCase(String week) {

        switch (week) {

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
            default:
                System.out.println("Default is Sunday");
        }

        System.out.println("out of switch case");

    }

    static int m1(int m) {

        return m;
    }

    public static void main(String[] args) {
        ifCondition();
        //elseIfCondition(85);
        //switchCase("Tuseday");
    }

}
