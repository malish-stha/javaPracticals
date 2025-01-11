package malish;

import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {

        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of classes held: ");
        int classesHeld = scanner.nextInt();

        System.out.print("Enter the number of classes attended: ");
        int classesAttended = scanner.nextInt();

        // Calculate the attendance percentage
        double attendancePercentage = ((double) classesAttended / classesHeld) * 100;

        // Display the attendance percentage
        System.out.println("Attendance Percentage: " + attendancePercentage + "%");

        // Check if the student is allowed to sit in the exam
        if (attendancePercentage >= 75) {
            System.out.println("The student is allowed to sit in the exam.");
        } else {
            System.out.println("The student is NOT allowed to sit in the exam.");
        }

        scanner.close();
    }
}
