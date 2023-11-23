package com.mycompany.christmastree;
public class ChristmasTree{
    public static void main(String[] args) {
        String c = "* ";
        String b = "  ";
        int height = 20;
        int width = 1;
        for (int i = 0; i < height/4; i++){
            for (int k = 0; k < height - i; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + width; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
         for (int i = 0; i < height/4; i++){
            for (int k = 0; k < (height - i) - 2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 5; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < height/4; i++){
            for (int k = 0; k < (height - i) - 4; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 9; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }
        for (int i = 0; i < height/4; i++){
            for (int k = 0; k < (height - i) - 6; k++){
                System.out.print(b);
            }
            for (int j = 0; j < i*2 + 13; j++){
                System.out.print(c);
            }
            
            System.out.print("\n");
        }
        for (int i = 0; i < height/4; i++){
            for (int k = 0; k < height -2; k++){
                System.out.print(b);
            }
            for (int j = 0; j < 5; j++){
                System.out.print(c);
            }
            System.out.print("\n");
        }   
    }   
}