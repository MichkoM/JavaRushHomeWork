package com.javarush.test.level03.lesson08.task02;

/* Зарплата через 5 лет
Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
«Имя» получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String sAge;
        String name = read.readLine();

       sAge = read.readLine();
        int number1 = Integer.parseInt(sAge);

        sAge = read.readLine();
        int number2 = Integer.parseInt(sAge);

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

        //напишите тут ваш код

    }
}