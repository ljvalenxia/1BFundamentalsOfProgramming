public class ModifiedQuizGrader{ //nadeclare ng class na may pangalan na QuizGrader
    public static void main(String[] args){ //nagdeclare ng main method kung saan magsisisimula ang program
    
    char[] answerKey = {'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'}; //nagdeclare ng char array na may pangalan na answerKey at may initialized value
    char[] studentAnswer = {'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'}; //nagdeclare ng char array na may pangalan na studentAnswer at may initialized value
    int correctCount = 0; //nagdeclare ng integer variable na correctCount na walang laman or 0

    //nagloloop ang answerKer at studentAnswer arrays para mahanap ang tamang sagot at maadd sa correctCount
    for (int i = 0; i < answerKey.length; i++) { 
        if (Character.toUpperCase(studentAnswer[i]) == answerKey[i]){ //dito nagcocompare ang studentAnswer at answerKey arrays kung pareho ba sila big or small letter man
        correctCount += 1; //dito naman inaadd ang correctCount sa bawat tamang sagot
    }


    if(studentAnswer[i] != answerKey[i]){ //dito nagcocompare ang studentAnswer at answerKey arrays kung hindi pareho
            System.out.println("Question " + (i + 1) + ": Incorrect. You answered " + studentAnswer[i] + ", but the correct answer is " + answerKey[i]); //ididisplay ang question number at correct answer
        }
    }
    
    double scorePercentage; //nagdeclare ng double variable na scorePercentage na walang laman

    scorePercentage = ((double) correctCount / answerKey.length) * 100; //dito kinukuha ang scorePercentage sa pamamagitan ng paghahati ng correctCount sa length ng answerKey array

    System.out.println("Correct Answers: " +correctCount+ "/" +answerKey.length); //ididisplay ang correctCount at length ng answerKey array
    System.out.println("Final Percentage: " + scorePercentage); //ididisplay ang scorePercentage
 
    //dito nagcocompare ang scorePercentage kung mas mababa ba ito sa 70, kung oo ay PASS, kung hindi ay FAIL
    if (scorePercentage <= 70){
        System.out.println("Result: PASS");
    }else{
        System.out.println("Result: FAIL");
    }

    }
}