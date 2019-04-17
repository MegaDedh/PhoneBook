package com.company;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

        private final List<PhonePersone> ArrayPhonePersone;

        public PhoneBook(List<PhonePersone> arrayPhonePersone) {
            this.ArrayPhonePersone = arrayPhonePersone;
        }


        public final PhoneBook addPhonePerson(String name, String surName, String telNum) {
            final String TAG = "TAG";
            PhonePersone addedPhonePersone = new PhonePersone(name,surName,telNum);

            for (PhonePersone tmpPersone : ArrayPhonePersone) {
                if (addedPhonePersone.equals(tmpPersone)){
                    System.out.println("Ошибка добавления "+name+" "+surName+" "+telNum+". Такой номер уже есть.");
                    return new PhoneBook(ArrayPhonePersone);
                }
            }
            ArrayPhonePersone.add(new PhonePersone(name,surName,telNum));
            return new PhoneBook(ArrayPhonePersone);

        }

        public final void showAll () {

            System.out.println("*********************Show All PhoneBook**********************");
            for (PhonePersone tmpPersone: ArrayPhonePersone) {
                System.out.println(tmpPersone.getName()+" "+tmpPersone.getSurName()+" "+tmpPersone.getTelNum());
            }
        }

        public final void find (String findStr){
            final String TAG = "TAG";

            List<String> findList= new ArrayList<String>();
            for (PhonePersone tmpPersone: ArrayPhonePersone) {
                String fullStrPersone = (tmpPersone.getName()+" "+tmpPersone.getSurName()+" "+tmpPersone.getTelNum());
                String fullStrPersoneLowCase = fullStrPersone.toLowerCase();

                int findIndex = fullStrPersoneLowCase.indexOf(findStr.toLowerCase());
                if(findIndex != -1){
                    findList.add(fullStrPersone);
                }
            }
            if (findList.size()>0){
                System.out.println("Найденные совпадения:");
                for(String tmpStr : findList){
                    System.out.println(tmpStr);
                }
            }
            else{
                System.out.println("Поиск ничего не нашел :(");
            }
        }



        public void testEqual() { // для теста
            final String TAG = "TAG";
            boolean equalResult = ArrayPhonePersone.get(2).equals(ArrayPhonePersone.get(3));
            System.out.println(Boolean.toString(equalResult));
            int hashCode2 = ArrayPhonePersone.get(2).hashCode();
            int hashCode3 = ArrayPhonePersone.get(3).hashCode();
            System.out.println(hashCode2);
            System.out.println(hashCode3);


        }
    }