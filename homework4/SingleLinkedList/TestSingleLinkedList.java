package hmJava3.GrokaemAlgoritms.dz.homework4.SingleLinkedList;

import hmJava3.GrokaemAlgoritms.dz.homework4.SingleLinkedList.SingleLinkedList;

public class TestSingleLinkedList {

    public static void main(String[] args){

        SingleLinkedList list = new SingleLinkedList();

        System.out.println(list);

        list.insert("Задание1");
        System.out.println(list);
        System.out.println("First is: " + list.getFirst());

        list.insert("Задание2");
        list.insert("Задание3");
        System.out.println(list);
        System.out.println("First is: " + list.getFirst());
        list.insert("Задание4");
        System.out.println(list);

        System.out.println("Удаляем: " + list.delete());
        System.out.println(list);
        System.out.println("Удаляем: " + list.delete());
        System.out.println(list);
        System.out.println("Удаляем: " + list.delete());
        System.out.println(list);
        System.out.println("Удаляем: " + list.delete());
        System.out.println(list);

        list.insert("Задание1");
        list.insert("Задание2");
        list.insert("Задание3");
        list.insert("Задание4");
        System.out.println(list);
        System.out.println("Содержит для список \"Задание1\" : " + list.contains("Задание1"));
        System.out.println("Индекс для \"Задание1\" " + list.indexOf("Задание1"));
        System.out.println("Содержит для список \"Задание2\" : " + list.contains("Задание2"));
        System.out.println("Индекс для \"Задание2\" " + list.indexOf("Задание2"));
        System.out.println("Содержит для список \"Задание3\" : " + list.contains("Задание3"));
        System.out.println("Индекс для \"Задание3\" " + list.indexOf("Задание3"));
        System.out.println("Содержит для список \"Задание4\" : " + list.contains("Задание4"));
        System.out.println("Индекс для \"Задание4\" " + list.indexOf("Задание4"));
        System.out.println("Содержит для список \"Задание5\" : " + list.contains("Задание5"));
        System.out.println("Индекс для \"Задание5\" " + list.indexOf("Задание5"));

        System.out.println(list);
        list.delete("Задание2");
        System.out.println(list);

        System.out.println("----------------------------");

        for(SingleLink singleLink : list){
            System.out.println(singleLink.getTask());
        }
    }

}
