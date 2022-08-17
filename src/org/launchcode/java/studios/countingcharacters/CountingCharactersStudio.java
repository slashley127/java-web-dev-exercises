package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharactersStudio {
    public static void main(String[] args){

        HashMap<Character, Integer> countCharacters = new HashMap<>();
        String inputString = "This is a quote from a movie, I need to actually copy and paste the quote.";
        char charactersInString [] = inputString.toCharArray();

        for(char letter : charactersInString){
            if(countCharacters.containsKey(letter)){
                countCharacters.put(letter, countCharacters.get(letter) + 1);
            } else {
                countCharacters.put(letter, 1);
            }
        }

        for(Map.Entry<Character, Integer> letter: countCharacters.entrySet()){
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }




        }




    }

