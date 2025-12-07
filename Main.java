import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // School Details
        System.out.println("=== School Performance Report System ===\n");

        System.out.print("Enter School Name: ");
        String schoolName = input.nextLine();

        System.out.print("Enter Teacher Name: ");
        String teacherName = input.nextLine();

        System.out.print("Enter Grade: ");
        String grade = input.nextLine();

        System.out.print("Enter Year: ");
        String year = input.nextLine();

        // minimum of 12 Student Records
        System.out.print("\nEnter number of students (At least 12): ");
        int numStudents = input.nextInt();
        input.nextLine();

        while (numStudents < 12) {
            System.out.print("Please enter at least 12 students: ");
            numStudents = input.nextInt();
            input.nextLine();
        }

        // Arrays to store student data
        String[] studentNames = new String[numStudents];
        double[] englishMarks = new double[numStudents];
        double[] mathsMarks = new double[numStudents];
        double[] historyMarks = new double[numStudents];
        double[] geographyMarks = new double[numStudents];
        double[] scienceMarks = new double[numStudents];
        double[] programmingMarks = new double[numStudents];
        double[] totalMarks = new double[numStudents];
        String[] ranks = new String[numStudents];

        // Input student data by the user
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Enter student name: ");
            studentNames[i] = input.nextLine();

            System.out.print("Enter English marks: ");
            englishMarks[i] = input.nextDouble();

            System.out.print("Enter Maths marks: ");
            mathsMarks[i] = input.nextDouble();

            System.out.print("Enter History marks: ");
            historyMarks[i] = input.nextDouble();

            System.out.print("Enter Geography marks: ");
            geographyMarks[i] = input.nextDouble();

            System.out.print("Enter Science marks: ");
            scienceMarks[i] = input.nextDouble();

            System.out.print("Enter Programming marks: ");
            programmingMarks[i] = input.nextDouble();
            input.nextLine();
        }

        // Results (Total Marks and Rank)
        for (int i = 0; i < numStudents; i++) {
            totalMarks[i] = englishMarks[i] + mathsMarks[i] + historyMarks[i] +
                    geographyMarks[i] + scienceMarks[i] + programmingMarks[i];

            // Allocation of rank based on total marks (6 subjects hence maximum is 600)
            if (totalMarks[i] >= 540.0) {
                ranks[i] = "A";
            } else if (totalMarks[i] >= 480.0) {
                ranks[i] = "B";
            } else if (totalMarks[i] >= 420.0) {
                ranks[i] = "C";
            } else if (totalMarks[i] >= 360.0) {
                ranks[i] = "D";
            } else {
                ranks[i] = "F";
            }
        }

        // Final Computation of the grade Statistics
        double totalEnglish = 0, totalMaths = 0, totalHistory = 0;
        double totalGeography = 0, totalScience = 0, totalProgramming = 0, grandTotal = 0;

        // Count grades
        int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

        for (int i = 0; i < numStudents; i++) {
            totalEnglish += englishMarks[i];
            totalMaths += mathsMarks[i];
            totalHistory += historyMarks[i];
            totalGeography += geographyMarks[i];
            totalScience += scienceMarks[i];
            totalProgramming += programmingMarks[i];
            grandTotal += totalMarks[i];

            // Count each grade
            switch (ranks[i]) {
                case "A" -> countA++;
                case "B" -> countB++;
                case "C" -> countC++;
                case "D" -> countD++;
                case "F" -> countF++;
            }
        }

        double avgEnglish = totalEnglish / numStudents;
        double avgMaths = totalMaths / numStudents;
        double avgHistory = totalHistory / numStudents;
        double avgGeography = totalGeography / numStudents;
        double avgScience = totalScience / numStudents;
        double avgProgramming = totalProgramming / numStudents;
        double avgTotal = grandTotal / numStudents;

        // Output
        System.out.println("\n\n");
        System.out.println("============================================================================================================");
        System.out.println("                        STUDENT PERFORMANCE REPORT");
        System.out.println("============================================================================================================");
        System.out.println("                      School: " + schoolName);
        System.out.println("                      Teacher: " + teacherName);
        System.out.println("                      Grade: " + grade);
        System.out.println("                      Year: " + year);
        System.out.println("============================================================================================================");
        System.out.println();
        System.out.println("Student Name\t\tEnglish\t\tMaths\t\tHistory\t\tGeography\tScience\t\tProgramming\tTotal\t\tRank");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        // Student data rows for all the 12 or more students
        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + "\t\t" + englishMarks[i] + "\t\t" + mathsMarks[i] + "\t\t" + historyMarks[i] + "\t\t" + geographyMarks[i] + "\t\t" + scienceMarks[i] + "\t\t" + programmingMarks[i] + "\t\t" + totalMarks[i] + "\t\t" + ranks[i]);
        }


        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Total Marks:\t\t" + totalEnglish + "\t\t" + totalMaths + "\t\t" + totalHistory + "\t\t" + totalGeography + "\t\t" + totalScience + "\t\t" + totalProgramming + "\t\t" + grandTotal);
        System.out.printf("Average Marks:\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n", avgEnglish, avgMaths, avgHistory, avgGeography, avgScience, avgProgramming, avgTotal);
        System.out.println("============================================================================================================");
        System.out.println("\nGRADE DISTRIBUTION:   A: "+countA+"\t\tB: "+countB+"\t\tC: "+countC+"\t\tD: "+countD+"\t\tF"+countF);
        System.out.println("============================================================================================================");
        System.out.println("\nGrading System: A (≥540), B (≥480), C (≥420), D (≥360), F (<360)");
        System.out.println("============================================================================================================");

    }
}