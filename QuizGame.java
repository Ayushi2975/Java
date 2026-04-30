import java.util.*;

class Question {
    String question;
    String[] options;
    int correctAnswer;

    Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void displayQuestion() {
        System.out.println("\n" + question);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    boolean checkAnswer(int userAnswer) {
        return userAnswer == correctAnswer;
    }
}

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
                "What is the capital of India?",
                new String[]{"Mumbai", "Delhi", "Kolkata", "Chennai"},
                2));

        questions.add(new Question(
                "Which language is used for Android development?",
                new String[]{"Python", "Java", "C++", "Swift"},
                2));

        questions.add(new Question(
                "Which data structure uses FIFO?",
                new String[]{"Stack", "Queue", "Tree", "Graph"},
                2));

        int score = 0;

        System.out.println("=== Welcome to Quiz Game ===");

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        System.out.println("\nYour final score: " + score + "/" + questions.size());
        sc.close();
    }
}