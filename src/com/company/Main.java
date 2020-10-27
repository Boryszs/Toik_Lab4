package com.company;

interface Cipher{
    String decode(final String message);

    String code(final String message);

}

class AtBashCipher implements Cipher{

    @Override
    public String decode(String message) {
        return null;
    }

    @Override
    public String code(String message) {
        return null;
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
