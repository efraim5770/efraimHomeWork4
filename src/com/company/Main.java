package com.company;

public class Main {

    public static void main(String[] args) {
        String[] arr = {
                "дом", "семья", "спорт", "поездка", "отпуск", "покупки", "инструменты", "школа", "универ", "спорт"
        };
        for (int i = 0; i < arr.length; i++) {
            String e = arr[i];
            boolean flag = true;
            int c = 0;
            for (int f = 0; f < arr.length; f++) {
                if (arr[f] == e) {
                    c++;
                    if(f<i)
                    {flag = false;}
                }
            }
            if (flag == true) {
                System.out.println(e + " " + c);
            }
        }
    }
}
