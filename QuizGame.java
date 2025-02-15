import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Answer the following questions by typing A, B, C, or D.\n");

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("A. Madrid");
        System.out.println("B. Berlin");
        System.out.println("C. Paris");
        System.out.println("D. Rome");
        System.out.print("Your answer: ");
        String answer1 = scanner.nextLine().toUpperCase();
        if (answer1.equals("C")) {
            score++;
        }

        // Question 2
        System.out.println("\n2. What is 5 + 7?");
        System.out.println("A. 10");
        System.out.println("B. 12");
        System.out.println("C. 15");
        System.out.println("D. 9");
        System.out.print("Your answer: ");
        String answer2 = scanner.nextLine().toUpperCase();
        if (answer2.equals("B")) {
            score++;
        }

        // Question 3
        System.out.println("\n3. Who developed the Java programming language?");
        System.out.println("A. James Gosling");
        System.out.println("B. Dennis Ritchie");
        System.out.println("C. Guido van Rossum");
        System.out.println("D. Bjarne Stroustrup");
        System.out.print("Your answer: ");
        String answer3 = scanner.nextLine().toUpperCase();
        if (answer3.equals("A")) {
            score++;
        }

        // Display final score
        System.out.println("\nQuiz completed! Your final score is: " + score + "/3");

        // Close scanner
        scanner.close();
    }
}
