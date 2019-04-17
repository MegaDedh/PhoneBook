package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        PhoneBook myPhoneBook = new PhoneBook(new ArrayList<PhonePersone>());

    //    Log.e(TAG,myPhoneBook.toString());
        myPhoneBook = myPhoneBook.addPhonePerson("Max","Kovalev","10001");
    //    Log.e(TAG,myPhoneBook.toString());
        myPhoneBook = myPhoneBook.addPhonePerson("Alexey","Voronin","10002");
    //    Log.e(TAG,myPhoneBook.toString());
        myPhoneBook = myPhoneBook.addPhonePerson("Alexander","Bobkov","10003");
    //    Log.e(TAG,myPhoneBook.toString());
        myPhoneBook = myPhoneBook.addPhonePerson("Konstantin","Murzin","10003");
    //    Log.e(TAG,myPhoneBook.toString());
        myPhoneBook = myPhoneBook.addPhonePerson("Artem","Morozov","10004");
    //    Log.e(TAG,myPhoneBook.toString());



        myPhoneBook.showAll();
        System.out.println("Введите фрагмент для поиска совпадений в книге:");
        String toFind = in.nextLine();
//        String toFind="ko";   //<<< будем искать такой фрагмент

        System.out.println("*************Поиск совпадений строки: "+toFind+"*******************");

        myPhoneBook.find(toFind);
        System.out.println("******Результат работы equal и hashCode() для 2 и 3 записи: *******");
        myPhoneBook.testEqual();
    }
}
