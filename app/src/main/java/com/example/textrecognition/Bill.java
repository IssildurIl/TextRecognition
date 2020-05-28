package com.example.textrecognition;

import java.util.ArrayList;

public class Bill {
    // позиции
    static ArrayList<String> position = new ArrayList<String>();
    // цены позийций
    static ArrayList<Double> price = new ArrayList<Double>();
    // люди позиции
    static ArrayList<ArrayList<Integer>> persons = new ArrayList<ArrayList<Integer>>();
    // все люди
    static ArrayList<String> pers_names = new ArrayList<String>();
    // результат
    static ArrayList<Double> result = new ArrayList<Double>();

    public Bill(){
        return;
    }

   // добавление людей
    public static void addPersonAll(String... v){
        String subStr2[];
        for (int i = 0; i < v.length; i++) {
            if(v[i].indexOf(" ")!= -1){
                subStr2 = v[i].split(" ");
                pers_names.add((subStr2[0].length() > 3 ? subStr2[0].substring(0, 3) : subStr2[0])+" "+(subStr2[1].length() > 3 ? subStr2[1].substring(0, 3) : subStr2[1]));
            }else{
                pers_names.add(v[i].length() > 4 ? v[i].substring(0, 4) : v[i]);
            }
        }
    }
    // количество людей в списке
    public static int getNumPerson(){
        return pers_names.size();
    }
   // получение строки с именами списком строк
   public ArrayList<String> getStringPerson(){
       return pers_names;
   }

   // добавление позиции, цены
    public static void addPosition(String pos, Double pric){
        position.add(pos);
        price.add(pric);
    }

    // выбор людей
    public static void addPerson2(String... v) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < v.length; i++) {
            a.add(pers_names.indexOf(v[i]));
        }
        persons.add(a);
    }
    // рассчет чека
    public static void count(){
        int coef;
        for (int i=0; i<pers_names.size(); i++){
            result.add(0.0);
        }
        for (int i=0; i<position.size(); i++){
            coef=persons.get(i).size();
            for (int j=0; j<coef; j++){
                result.set(persons.get(i).get(j),result.get(persons.get(i).get(j))+price.get(i)/coef);
            }
        }
    }
    // вывод результата по имени человека
    public static double printResult(String n){
        int id=pers_names.indexOf(n);
        return result.get(id);
    }
}
