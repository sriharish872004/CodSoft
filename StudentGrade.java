import java.util.*;
import java.lang.*;

class StudentGradeCalculator {
    public static int[] getMarks(int numSub, Scanner sc) {
        int i;
        int[] marks = new int[numSub];
        for (i = 0; i < numSub; i++) {
            while (true) {
                System.out.println("Enter the subject " + (i + 1) + " mark between 0-100:");
                int mark = sc.nextInt();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    break;
                } else {
                    System.out.println("Invalid mark, please enter a mark between 0 and 100.");
                }
            }
        }
        return marks;
    }
    public static int calculateAverage(int[] marks) {
        int totalScore = 0;
        for (int i = 0; i < marks.length; i++) {
            totalScore += marks[i];
        }
        return totalScore / marks.length;
    }
    public static char calculateGrade(int averageMark) {
        if (averageMark >= 90) {
            System.out.println("Excellent");
            return 'O';
        } else if (averageMark >= 80) {
            System.out.println("Good");
            return 'A';
        } else if (averageMark >= 70) {
            System.out.println("Average");
            return 'B';
        } else if (averageMark >= 60) {
            System.out.println("Need Some Improvement");
            return 'C';
        } else if (averageMark >= 50) {
            System.out.println("Border Pass");
            return 'D';
        } else {
            System.out.println("Fail!!");
            return 'F';
        }
    }
    public static void display(int numSub,Scanner sc) {
        int[] marks = getMarks(numSub, sc); // Get the marks array
        int averageMark = calculateAverage(marks);
        char grade = calculateGrade(averageMark);
        System.out.println("Average Mark Obtained: " + averageMark +"%");
        System.out.println("Grade: " + grade);
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Calculate Your Grade ***");
        System.out.print("Enter the Number of Subjects: ");
        int numSub = sc.nextInt();
        // Since all methods are static no need to call with class obj, we can call directly...
        display(numSub, sc);
    }
}
