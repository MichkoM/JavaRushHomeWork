package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan=new Scanner(System.in);
   int a=scan.nextInt();
   int b=scan.nextInt();
   int c=scan.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c) System.out.println(a+" "+b+" "+c);
            else System.out.println(a+" "+c+" "+b);
        }

        if ((b>a)&&(b>c)){
            if (a>c) System.out.println(b+" "+a+" "+c);
            else System.out.println(b+" "+c+" "+a);
        }

        if ((c>a)&&(c>b)){
            if (a>b) System.out.println(c+" "+a+" "+b);
            else System.out.println(c+" "+b+" "+a);
        }
    }
}