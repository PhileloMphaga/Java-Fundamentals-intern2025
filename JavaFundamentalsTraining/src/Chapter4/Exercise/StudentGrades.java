package Chapter4.Exercise;

import java.util.Scanner;

/**
 * @author Philelo Mphaga
 * Ecercise
 */

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greetings();

        System.out.println("Enter first name: ");
        String firstname = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastname = sc.nextLine();

        System.out.println("Enter birth year: ");
        int birthYear = sc.nextInt();

        System.out.println("Enter test marks: ");
        int testMarks = sc.nextInt();


        int Age = determineAge(birthYear);
        String Grade = determineGrade(testMarks);

        displayOutput(firstname, lastname,Age,Grade);

    }

    public static void greetings(){
        System.out.println("Hi, welcome to your student grades portal.");
    }

    public static String determineGrade(int testMark){
        if(testMark>=90){
            return "A+";
        }else if(testMark>=80){
            return "A";
        }else if(testMark>=70){
            return "B";
        }else if(testMark>=60){
            return "C";
        }else if(testMark>=50){
            return "D";
        }else if(testMark>=40){
            return "D-";
        }else{
            return "F";
        }
    }

    public static int determineAge(int Year){
        int currentYear = 2025;
        int age;
        age = currentYear - Year;
        return age;
    }

    public static void displayOutput(String name, String lastname, int age, String Grade ){
        System.out.println("\n------Student Grades------");
        System.out.println("Name: "+name);
        System.out.println("Last name: "+lastname);
        System.out.println("Age: "+age);
        System.out.println("Grade: "+Grade);
    }
}
