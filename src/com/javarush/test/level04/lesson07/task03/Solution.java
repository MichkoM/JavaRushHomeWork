package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int a;
        int b=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <3 ; i++)
        {
            a=scan.nextInt();
            if (a>0)
               b=b+1;
        }
        System.out.println(b);


    }
}
