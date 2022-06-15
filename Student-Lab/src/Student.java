/*
    Name: Xander Russell
    Date: 6/15/2022
    Lab: Student Lab
    Extra: The user puts in the name and three quiz scores, rather than the test data being given by the program.
 */

public class Student {

    private final String name;
    private int totalScore, totalQuizCount;
    private double average;

    public Student(String a) {
        name = a;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public double getAverage() {
        return average;
    }

    // Adds a quiz score, and updates the average.
    public void addQuiz(int score) {
        totalScore += score;
        totalQuizCount++;
        if (totalQuizCount == 1) {
            average = totalScore;
        } else {
            average = (average + score) / 2;
        }
    }


}
