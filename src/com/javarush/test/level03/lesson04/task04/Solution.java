package com.javarush.test.level03.lesson04.task04;

/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
     Long i=1L;


        for (int j=2;j<=10;j++ ){
            i=i*j;
        }
        System.out.println(i);



    }
}