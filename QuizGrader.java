public class QuizGrader {
    public static void main(String[] args) {

        char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; /* Dito nilagay natin sa array ang mga
        tamang sagot sa sampung tanong  */

        char[] studentAnswers = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; /* Dito nilagay din natin
        sa array ang mga sagot ng mga estyudante */

        int correctCount = 0; // Sa line na to nagsisimula sa zero ang bilang ng tamang sagot
        
        System.out.println("--- Quiz Results ---"); // Ito naman ang magprint ng heading natin na Quiz Results
       
        for (int i = 0; i < answerKey.length; i++) { // Dito inuulit ulit ang code para macheck lahat ng tanong
            
            char studentAnswer = Character.toUpperCase(studentAnswers[i]); /* Ginagawang uppercase ang sagot ng estyudante
              kung lowercase ito */
            
            char correctAnswer = Character.toUpperCase(answerKey[i]);  // Ginagawang uppercase din ang tamang sagot
            
            if (studentAnswer == correctAnswer) { /* Sa linyang ito sinusuri kung magkapareho ba ang sagot ng 
                // estyudante at tamang sagot */
                
                correctCount++; // Dinadagdagan ng isa ang bilang ng tamang sagot
                
                System.out.println("Question " + (i + 1) + ": Correct!"); /* Dito ipinapakita na tama ang sagot 
                sa tanong na ito */
            }
            
            else { // Kapag hindi magkapareho ang sagot

                // Ipinapakita dito ang bilang ng mga tanong, sagot ng estyudante, at tamang sagot
                System.out.println("Question " + (i + 1) + ": Incorrect. You answered '" + studentAnswer + "', correct answer is '" + correctAnswer + "'.");
                
            }
        }

        
        int totalQuestions = answerKey.length; // Kinukuha ang lahat ng bilang ng questions

        
        double scorePercentage = ((double) correctCount / totalQuestions) * 100; // Kinukuha ang percentage ng tamang sagot
        
        System.out.println("\n--- Final Score ---"); // Dito ipapakita ng heading para sa final score
        
        System.out.println("Correct Answers: " + correctCount + "/" + totalQuestions);  /* Ipinapakita ang bilang ng tamang
         sagot at kabuuang questions */
        
        System.out.println("Score Percentage: " + scorePercentage + "%"); // Ipinapakita ang score ng student bilang percentage
        
        if (scorePercentage >= 70.0) { // Sa linya na ito sinusuri kung ang score ay 70 percent pataas

            
            System.out.println("Result: PASS"); // Dito ipinapakita na pasado ang student
        }
        
        else { // Kapag mas mababa sa 70 percent ang score

            
            System.out.println("Result: FAIL"); // Dito ipinapakita na bagsak ang student
        }
    }
}
