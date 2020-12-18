package com.company;

public class Main {

    public static void main (String[] args) {
    print();
    printOurWord("Привет");
        System.out.println("Сумма двух чисел: " + getSumOfValues(7,8));

    }
    public static void print(){
        System.out.println("Привет мир!");
    }

    public static void printOurWord(String word){
        System.out.println("Ваше слово: " + word);
        word = "Hello";
    }

    public static int getSumOfValues(int num1,int num2){
        return num1 + num2;
    }
}
