package com.mckeel.hourofcode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Created by Chandan on 12/6/2018.
 */
public class Problem3 {
    private static final String INPUT_FILE_NAME = "src/resources/Prob03.in.txt";

    public static String addiply(){
        String answer = null;
        try{
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);

            //TODO: You can use the Buffered Reader object br to get lines from our input file! Try writing 'br.' and see what methods are available.

        }
        catch (Exception e) {
            e.printStackTrace();
        }

        //Return the string containing your answer
        return "...";
    }
}
