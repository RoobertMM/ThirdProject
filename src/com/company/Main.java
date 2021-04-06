package com.company;

public class Main {

    public static int calculateDifference(int numberOne, int numberTwo){
        return numberOne - numberTwo;
    }
    public static int calculateProduct(int numberOne, int numberTwo, int numberTree, int numberFour, int numberFive, int numberSix){
        return numberOne * numberTwo * numberTree * numberFour * numberFive * numberSix;
    }
    public static int calculateSquareArea(int numberOne){
        return numberOne * numberOne;
    }



















    public static void main(String[] args) {

        System.out.println("128-5252=");
        System.out.println(calculateDifference(128, 5252));

        System.out.println("44*22*1*3*0*5=");
        System.out.println(calculateProduct(44,22,1,3,0,5));

        System.out.println("A square has a 4 cm side, calculate the Area of the square.\n Area of a square is calculated a square side=>\n => Area= 4^2\n         =4*4=");
        System.out.println(calculateSquareArea(4));
    }
}
