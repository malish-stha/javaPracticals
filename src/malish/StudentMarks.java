package malish;

public class StudentMarks {
    public static void main(String[] args) {
        System.out.println("Name: Malish Shrestha\nRollno: 1015\n");

        int marks[][] = {
                {39, 44, 67, 87},
                {35, 55, 45, 65},
                {29, 88, 56, 78},
                {64, 44, 55, 81}
        };

        int[] totalMarks = new int[4];
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < marks.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            totalMarks[i] = sum;
            if (sum > highest) {
                highest = sum;
            }
            if (sum < lowest) {
                lowest = sum;
            }
        }

        System.out.println("Total marks obtained by each student:");
        for (int i = 0; i < totalMarks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + totalMarks[i]);
        }

        System.out.println("\nHighest total marks: " + highest);
        System.out.println("Lowest total marks: " + lowest);

        System.out.println("\nNumber of subjects failed by each student (pass mark is 40):");
        for (int i = 0; i < marks.length; i++) {
            int failedSubjects = 0;
            for (int j = 0; j < marks[i].length; j++) {
                if (marks[i][j] < 40) {
                    failedSubjects++;
                }
            }
            System.out.println("Student " + (i + 1) + ": " + failedSubjects + " subjects failed.");
        }
    }
}
