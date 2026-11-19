public class QuizGrader {
    public static void main(String[] args) {

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; /* Dito nilagay natin sa array ang mga
        tamang sagot sa sampung tanong  */

        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; /* Dito nilagay din natin
        sa array ang mga sagot ng mga estyudante */

        int correctCount = 0; // Sa line na to nagsisimula sa zero ang bilang ng tamang sagot

        // Nagpapakita ng heading para sa quiz results
        System.out.println("--- Quiz Results ---");

        // Inuulit ang code para ma-check ang lahat ng questions
        for (int i = 0; i < answerKey.length; i++) {

            // Ginagawang uppercase ang sagot ng student para hindi mahalaga kung lowercase ito
            char studentAnswer = Character.toUpperCase(studentAnswers[i]);

            // Ginagawang uppercase din ang tamang sagot
            char correctAnswer = Character.toUpperCase(answerKey[i]);

            // Sinusuri kung magkapareho ang sagot ng student at tamang sagot
            if (studentAnswer == correctAnswer) {

                // Dinadagdagan ng isa ang bilang ng tamang sagot
                correctCount++;

                // Ipinapakita na tama ang sagot sa question na ito
                System.out.println("Question " + (i + 1) + ": Correct!");
            }

            // Kapag hindi magkapareho ang sagot
            else {

                // Ipinapakita ang question number, sagot ng student, at tamang sagot
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswer + "', correct answer is '" + correctAnswer + "'.");
            }
        }

        // Kinukuha ang kabuuang bilang ng questions
        int totalQuestions = answerKey.length;

        // Kinukuha ang percentage ng tamang sagot
        double scorePercentage = ((double) correctCount / totalQuestions) * 100;

        // Nagpapakita ng heading para sa final score
        System.out.println("\n--- Final Score ---");

        // Ipinapakita ang bilang ng tamang sagot at kabuuang questions
        System.out.println("Correct Answers: " + correctCount + "/" + totalQuestions);

        // Ipinapakita ang score ng student bilang percentage
        System.out.println("Score Percentage: " + scorePercentage + "%");

        // Sinusuri kung ang score ay 70 percent pataas
        if (scorePercentage >= 70.0) {

            // Ipinapakita na pasado ang student
            System.out.println("Result: PASS");
        }

        // Kapag mas mababa sa 70 percent ang score
        else {

            // Ipinapakita na bagsak ang student
            System.out.println("Result: FAIL"); 
        }
    }
}
