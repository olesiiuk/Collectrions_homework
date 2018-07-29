package ua.kpi.tef2.task2;

public class Task2 {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        for (Integer i : list) {
            System.out.println(i);

        }


    }


}
