package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> history = new ArrayList<>();
	Scanner keyboard = new Scanner(System.in);
	boolean repeat = true;

	do{
        System.out.println("Enter president: ");
        String word = keyboard.next();
        if(word.equalsIgnoreCase("history")){
            repeat = false;
        }
        else{
            history.add(word);
        }
    } while(repeat);
	for(int i = history.size()-1; i >= 0; i--){
        System.out.println(history.get(i));
    }


    }
}
