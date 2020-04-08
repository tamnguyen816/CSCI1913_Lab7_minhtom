/*
Name: Minh Tam H Nguyen
Class: CSCI1913 LAB 7
Date: 03/24/2020
 */

import java.lang.reflect.Array;

public class KnownSpy {

    private String name;
    private CaesarCipher caesarCipher;

    public KnownSpy(String name, CaesarCipher caesarCipher){
        this.name = name;
        this.caesarCipher = caesarCipher;
    }

    public String getName(){
        return name;
    }

    public void decrypt(Message message){
        String from = message.getFrom();
        String textMessage = message.getMessage();
        if (from == name){
            textMessage = caesarCipher.decrypt(textMessage);
        }
        message.setMessage(textMessage);
    }

    public static boolean isFromSpy(KnownSpy[] knownSpies, Message message){
        int length = Array.getLength(knownSpies);
        String spyName;
        String from = message.getFrom();
        int count = 0;

        int i = 0;
        do {
            spyName = knownSpies[i].getName();

            if(spyName == from){
                count = 1;
            }
            i++;
        }
        while(i < length);
        return count == 1;
    }
}
