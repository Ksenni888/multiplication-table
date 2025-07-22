package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число строк таблицы от 1 до 32");
        int row = scan.nextInt();
        System.out.println("Введите число столбцов таблицы от 1 до 32");
        int column = scan.nextInt();
        int substrate = String.valueOf((row*column)).length();
        Map<Integer,String> pattern = new HashMap<>();
        pattern.put(0,"--");
        pattern.put(1,"+-");
        pattern.put(2,"+--");
        pattern.put(3,"+---");
        pattern.put(4,"+----");
        pattern.put(5,"+-----");
        Map<Integer,String> patternForFigure = new HashMap<>();
        patternForFigure.put(1," ");
        patternForFigure.put(2,"  ");
        patternForFigure.put(3,"   ");
        patternForFigure.put(4,"    ");
        patternForFigure.put(0,"");
        for ( int i=0; i<=row; i++)
        { for (int b=0; b<=column; b++){
            if(i==0&&b==0){System.out.print(patternForFigure.get(2)); System.out.print("|");continue;}
            if(i==0&&b!=0){System.out.print(patternForFigure.get(substrate-String.valueOf(b).length())+b); System.out.print("|"); continue;}
            if(b==0&&i!=0){System.out.print(patternForFigure.get(2-String.valueOf(i).length())+i);System.out.print("|"); continue;}
            System.out.print(patternForFigure.get(substrate-String.valueOf(i*b).length())+(i*b));System.out.print("|");}
            System.out.println();
            for(int bi=0;bi<=column; bi++) {
                if (bi==0){System.out.print(pattern.get(0)); continue;}
                System.out.print(pattern.get(substrate));
            }
            System.out.println();
        }
    }
}