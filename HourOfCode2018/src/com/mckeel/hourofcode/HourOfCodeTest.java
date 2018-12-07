package com.mckeel.hourofcode;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Created by Chandan and Sharon on 12/6/2018.
 */
public class HourOfCodeTest {
    private static final String SEPARATOR = "******************************************************************************";

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Your application is now running.");
        String[] expectedAnswers = loadData();
        System.out.println("Scoring your answers...\n");
        Thread.sleep(1000);

        String problem1Answer = Problem1.printTwice();
        evaluateAnswer(1, problem1Answer, expectedAnswers[0]);

        String problem2Answer = Problem2.removeCharacter();
        evaluateAnswer(2, problem2Answer, expectedAnswers[1]);

        String problem3Answer = Problem3.addiply();
        evaluateAnswer(3, problem3Answer, expectedAnswers[2]);

        String problem4Answer = Problem4.calcFibonacci();
        evaluateAnswer(4, problem4Answer, expectedAnswers[3]);

        String problem5Answer = Problem5.categorizeDonors();
        evaluateAnswer(5, problem5Answer, expectedAnswers[4]);

        String problem6Answer = Problem6.printICAO();
        evaluateAnswer(6, problem6Answer, expectedAnswers[5]);

        String problem7Answer = Problem7.getSluggingPercentage();
        evaluateAnswer(7, problem7Answer, expectedAnswers[6]);

        String problem8Answer = Problem8.getSpaceShipTravelTime();
        evaluateAnswer(8, problem8Answer, expectedAnswers[7]);

        String problem9Answer = Problem9.createCipher();
        evaluateAnswer(9, problem9Answer, expectedAnswers[8]);

        String problem10Answer = Problem10.mapToLeft();
        evaluateAnswer(10, problem10Answer, expectedAnswers[9]);

        String problem11Answer = Problem11.reverseWords();
        evaluateAnswer(11, problem11Answer, expectedAnswers[10]);

        String problem12Answer = Problem12.calculateInterest();
        evaluateAnswer(12, problem12Answer, expectedAnswers[11]);

        String problem13Answer = Problem13.outputQualityLevel();
        evaluateAnswer(13, problem13Answer, expectedAnswers[12]);

        String problem14Answer = Problem14.displayCatalog();
        evaluateAnswer(14, problem14Answer, expectedAnswers[13]);

        String problem15Answer = Problem15.getPokerHand();
        evaluateAnswer(15, problem15Answer, expectedAnswers[14]);

        String problem16Answer = Problem16.unscramble();
        evaluateAnswer(16, problem16Answer, expectedAnswers[15]);

        String problem17Answer = Problem17.outputBoard();
        evaluateAnswer(17, problem17Answer, expectedAnswers[16]);

        String problem18Answer = Problem18.printPressure();
        evaluateAnswer(18, problem18Answer, expectedAnswers[17]);
    }

    public static void evaluateAnswer(int problemNumber, String applicationOutput, String expectedOutput){
        if(applicationOutput.equals(expectedOutput))
            System.out.println(String.format("Problem #%d was a SUCCESS!\nAnswer matched expected output:\n%s\n", problemNumber, expectedOutput));
        else{
            System.err.println(String.format("Problem #%d FAILED! \nExpected output was: \n%s\nYour output was: \n%s\n", problemNumber, expectedOutput, applicationOutput==null ? "NULL!" : applicationOutput));
        }
    }

    public static String getTextFromFile(String path){
        try{
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            return new String(encoded, UTF_8);
        }
        catch(IOException e){
            e.printStackTrace();
            return null;
        }
    }

    public static String[] loadData(){
        String[] returnData = new String[18];
        for(int i = 0; i < returnData.length; i++){
            returnData[i] = getTextFromFile(String.format("src\\resources\\expectedOutputs\\Prob%02d.out.txt", i+1));
        }
        return returnData;
    }
}
