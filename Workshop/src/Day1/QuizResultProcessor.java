package Day1;

import java.util.*;

public class QuizResultProcessor {

    // Custom exception for invalid submissions
    static class InvalidQuizSubmissionException extends Exception {
        public InvalidQuizSubmissionException(String message) {
            super(message);
        }
    }

    // Method to calculate score
    public static int calculateScore(String[] correct, String[] user) throws InvalidQuizSubmissionException {
        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer count doesn't match.");
        }

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }

    // Method to get grade
    public static String getGrade(int score, int total) {
        double percent = (score * 100.0) / total;
        if (percent >= 90) return "A";
        else if (percent >= 75) return "B";
        else if (percent >= 60) return "C";
        else if (percent >= 40) return "D";
        else return "F";
    }

    // Main method
    public static void main(String[] args) {
        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        
        List<String[]> userSubmissions = new ArrayList<>();
        userSubmissions.add(new String[]{"A", "B", "C", "D", "A"}); // 5
        userSubmissions.add(new String[]{"A", "B", "D", "D", "B"}); // 3
        userSubmissions.add(new String[]{"A", "C", "D", "A", "B"}); // 1

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < userSubmissions.size(); i++) {
            try {
                int score = calculateScore(correctAnswers, userSubmissions.get(i));
                scores.add(score);
                String grade = getGrade(score, correctAnswers.length);
                System.out.println("User " + (i + 1) + " Score: " + score + "/" + correctAnswers.length + " Grade: " + grade);
            } catch (InvalidQuizSubmissionException e) {
                System.out.println("User " + (i + 1) + " Error: " + e.getMessage());
            }
        }
    }
}
