package term1.lesson14.opgave3MutipelChoice;

import java.util.Arrays;

public class MultipleChoice {
    private char[] correctAnswer = { 'B', 'C', 'A', 'A', 'B', 'A', 'C', 'D', 'A', 'C' };

    private char[][] studentAnswers;

    public MultipleChoice(int numberOfStudents) {
        studentAnswers = new char[numberOfStudents][10];
        for (int i = 0; i < studentAnswers.length; i++) {
            for (int j = 0; j < studentAnswers[i].length; j++) {
                int tal = (int) (Math.random() * 4); // tal mellem 0-3
                char c = (char) (tal + 'A');
                studentAnswers[i][j] = c;
            }
        }
    }

    public void printStudentAnswers() {
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Student " + (i + 1) + " resultat: ");
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (j != 0) {
                    System.out.print(", ");
                }
                System.out.print(studentAnswers[i][j]);
            }
            System.out.println();
        }
    }

    public void printCorrectAnswers() {
        System.out.println("De korrekte svar:  " + Arrays.toString(correctAnswer));
    }

    /**
     * Udskriver for hver studerende antallet af rigtige svar
     */
    public void printCorrectAnswersPrStudent() {
        System.out.println("Nedenfor finder du antallet af korrekte svar for hver student:");
        int studentsWithAllCorrect = 0;
        for (int i = 0; i < studentAnswers.length; i++) {
            int correctAnswers = 0;
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] == correctAnswer[j]) {
                    correctAnswers++;
                }
            }
            if (correctAnswers == correctAnswer.length) {
                System.out.println(correctAnswer.length);
                studentsWithAllCorrect++;
            }
            System.out.println("Student " + (i + 1) + " korrekte: " + correctAnswers);
        }
        // Testet ved at sætte antal af spørgsmål og svar ned til 2, så det er nemmere
        // at ramme rigtigt på alle. Virkede fint.
        System.out.println("Studerende med alle rigtige: " + studentsWithAllCorrect);
    }

    /**
     * Udskriver for hver spørgsmål antallet af rigtige svar
     */
    public void printCorrectAnswerPrQuestion() {
        System.out.println("Nedenfor finder du antallet af korrekte svar på hvert spørgsmål:");
        // TODO
    }

}
