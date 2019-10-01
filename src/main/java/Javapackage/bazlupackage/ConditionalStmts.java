package Javapackage.bazlupackage;

public class ConditionalStmts {
    /*
     *Conditional Statements ::
     *
     * 1. if :: only one condition
     * 2. else if :: Multiple conditions
     * 3. switch case :: Multiple conditions and expression
     *
     */

    void ifStatement(int m) {

        if (m < 40) {
            System.out.println("The student is failed");
        } else {
            System.out.println("The student is passed");
        }

    }

    void elseIfStatement(int m) {

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

    void m(String week) {

        if(week.equals("Sunday")) {
            System.out.println("Sunday");
        }
        else if(week.equals("Monday")) {
            System.out.println("Monday");
        }
        else if(week.equals("Tuesday")) {
            System.out.println("Tuesday");
        }
        else if(week.equals("Wednesday")) {
            System.out.println("Wednesday");
        }
        else if(week.equals("Thurseday")) {
            System.out.println("Thurseday");
        }
        else if(week.equals("Friday")) {
            System.out.println("Friday");
        }
        else if(week.equals("Saturday")) {
            System.out.println("Saturday");
        }
        else {
            System.out.println("Default is Sunday");
        }



    }


    void switchCaseStatement(String week) {

        switch (week) {

            case "Sunday":
                System.out.println("Sunday");
                //break;
            case "Monday":
                System.out.println("Monday");
                //break;
            case "Tuesday":
                System.out.println("Tuesday");
                //break;
            case "Wednesday":
                System.out.println("Wednesday");
                //break;
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

        System.out.println("Out of switch statement");

    }

    public static void main(String[] args) {

        ConditionalStmts obj = new ConditionalStmts();

        //obj.ifStatement(39);
        //obj.elseIfStatement(65);
        obj.switchCaseStatement("Sunday");
        //obj.m("Sunday");
    }

}
