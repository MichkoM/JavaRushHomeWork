package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {

        Zerg zerg = new Zerg();
        zerg.name = "rtr";
        Zerg zerg1 = new Zerg();
        zerg1.name = "rt12r";
        Zerg zerg2 = new Zerg();
        zerg2.name = "rt21r";
        Zerg zerg3 = new Zerg();
        zerg3.name = "r3t12r";
        Zerg zerg4 = new Zerg();
        zerg4.name = "r1t21r";
        Zerg zerg5 = new Zerg();
        zerg5.name = "r456tr";
        Zerg zerg6 = new Zerg();
        zerg6.name = "r4678tr";
        Zerg zerg7 = new Zerg();
        zerg7.name = "r7893645tr";
        Zerg zerg8 = new Zerg();
        zerg8.name = "r789/tr";
        Zerg zerg9 = new Zerg();
        zerg9.name = "rt789r";


        Protos protos = new Protos();
        protos.name = "rt789r";
        Protos protos1 = new Protos();
        protos.name = "rt789r";
        Protos protos2 = new Protos();
        protos2.name = "rt789r";
        Protos protos3 = new Protos();
        protos3.name = "rt789r";
        Protos protos4 = new Protos();
        protos4.name = "rt789r";

        Terran terran = new Terran();
        terran.name = "rtr";
        Terran terran1 = new Terran();
        terran1.name = "rtr";
        Terran terran2 = new Terran();
        terran2.name = "rtr";
        Terran terran3 = new Terran();
        terran3.name = "rt5r";
        Terran terran4 = new Terran();
        terran4.name = "rtr";
        Terran terran5 = new Terran();
        terran5.name = "rtr";
        Terran terran6 = new Terran();
        terran6.name = "rtr";
        Terran terran7 = new Terran();
        terran7.name = "rtr";
        Terran terran8 = new Terran();
        terran8.name = "rtr";
        Terran terran9 = new Terran();
        terran9.name = "rtr";
        Terran terran10 = new Terran();
        terran10.name = "rtr";
        Terran terran11 = new Terran();
        terran11.name = "rtr";


    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}