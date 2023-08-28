package com.company;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the weights of different components
        System.out.print("Enter the weight of assignments (in %): ");
        double assignmentWeight = scanner.nextDouble();

        System.out.print("Enter the weight of quizzes (in %): ");
        double quizWeight = scanner.nextDouble();

        System.out.print("Enter the weight of exams (in %): ");
        double examWeight = scanner.nextDouble();

        // Input the scores for each component
        System.out.print("Enter the total score for assignments: ");
        double assignmentScore = scanner.nextDouble();

        System.out.print("Enter the total score for quizzes: ");
        double quizScore = scanner.nextDouble();

        System.out.print("Enter the total score for exams: ");
        double examScore = scanner.nextDouble();

        // Calculate the final grade
        double finalGrade = (assignmentScore * assignmentWeight / 100) +
                            (quizScore * quizWeight / 100) +
                            (examScore * examWeight / 100);

        // Output the final grade
        System.out.println("Final Grade: " + finalGrade);

        scanner.close();
    }
}
