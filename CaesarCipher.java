/*
Name: Minh Tam H Nguyen
Class: CSCI1913 LAB 7
Date: 03/24/2020
 */

import java.io.*;
import java.util.Scanner;

public class CaesarCipher {

    private int keyVal;

    public CaesarCipher(int keyVal){
        /* Constructor of the class
           Takes 1 argument: int keyVal
         */
        this.keyVal = keyVal;
    }

    public boolean isValid(){
        if( 1 <= this.keyVal && this.keyVal <= 25)
            return true;
        else if (this.keyVal == 0 || this.keyVal == 26)
            return false;
        else {
            return false;
        }
    }

    public String encrypt(String script){
        //dealing with upper case
        script = script.toLowerCase();

        char[] scriptArray = script.toCharArray();
        String encrypted = "";

        for(int i = 0; i < script.length(); i++)
        {
            //check if it is a lower case letter
            if(97 <= (int)scriptArray[i] && (int)scriptArray[i] <= 122)
                scriptArray[i] = (char) (((int) scriptArray[i] + keyVal - 97) % 26 + 97);

            encrypted = encrypted + scriptArray[i];
        }
        return encrypted;
    }

    public String decrypt(String script){
        script = script.toLowerCase();

        char[] scriptArray = script.toCharArray();
        String decrypted = "";
        int imSoDone;


        for(int i = 0; i < script.length(); i++)
        {
            //check if it is a lower case letter
            if(97 <= (int)scriptArray[i] && (int)scriptArray[i] <= 122) {

                imSoDone = (int)scriptArray[i] - keyVal;

                //if this is less than A
                if (imSoDone < 97){
                    scriptArray[i] = (char)(imSoDone + 122 - 97 + 1 );
                }
                else{
                    scriptArray[i] = (char) (((int) scriptArray[i] - keyVal - 97) % 26 + 97);
                }
                decrypted += scriptArray[i];
            }
            else{
                decrypted = decrypted + scriptArray[i];
            }
        }
        return decrypted;
    }

    public String toString(){
        return "Caesar(" + keyVal + ")";
    }
}


