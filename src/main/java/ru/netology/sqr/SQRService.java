package ru.netology.sqr;

public class SQRService {

    public int squares(int numberfirst, int numbertwo) {

        for (int i = 10; i <= 99; i++) {
            if (i * i >= numberfirst) {
                if (i * i <= numbertwo) {
                    System.out.println("Квадрат числа " + i + "(" + i * i + ")" + " попадает в диапазон от " + numberfirst + " до " + numbertwo);
                    return i;
                }
            }
        }
        return 0;
    }
}


