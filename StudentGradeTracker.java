import java.util.Scanner;

public class StudentGradeTracker {

    
    static String calculateGrade(double marks) {

        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

       
        String[] names = new String[n];
        double[] marks = new double[n];

       
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks: ");
            marks[i] = sc.nextDouble();
            sc.nextLine();
        }

        
        double total = 0;

        for (int i = 0; i < n; i++) {
            total = total + marks[i];
        }

        
        double average = total / n;

        
        double highest = marks[0];
        double lowest = marks[0];

        for (int i = 1; i < n; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }
        }

        
        System.out.println("\n=================================");
        System.out.println("       STUDENT GRADE REPORT");
        System.out.println("=================================");

        for (int i = 0; i < n; i++) {

            System.out.println(
                names[i] + " : " + marks[i] +
                " : Grade " + calculateGrade(marks[i])
            );
        }

        System.out.println("---------------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);
        System.out.println("=================================");

        sc.close();
    }
}