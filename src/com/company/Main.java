package com.company;

import java.util.ArrayList;
import java.util.List;

interface Cipher{
    String decode(final String message);

    String code(final String message);

}

class AtBashCipher implements Cipher{

    private List<Character> characters=new ArrayList<>();

    public List<Character> getCharacters() {
        return characters;
    }

    public AtBashCipher() {
        for(int i = 0; i < 26; i++){
            characters.add((char)(97 + i));
        }
    }

    @Override
    public String decode(String message) {
        return null;
    }

    @Override
    public String code(String message) {
        String code=new String();
        int index=0;
        int length=characters.size()-1;
        for (int i = 0;i < message.length(); i++){
            if (Character.isUpperCase(message.charAt(i))) {
                index=characters.indexOf(Character.toLowerCase(message.charAt(i)));
                code+= Character.toUpperCase(characters.get(length-index));
            }else if (Character.isLowerCase(message.charAt(i))) {
                index=characters.indexOf(message.charAt(i));
                code+=characters.get(length-index);
            }else{
                code+=" ";
            }

        }
        return code;
    }
}

public class Main {

    public static void main(String[] args) {
        AtBashCipher atBashCipher=new AtBashCipher();
        List<Character> cha=atBashCipher.getCharacters();

        System.out.println(atBashCipher.code("Ala ma kota"));
    }
}
