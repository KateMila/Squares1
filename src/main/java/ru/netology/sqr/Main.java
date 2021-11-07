package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        int numberfirst = 100;
        int numbertwo = 200;

        SQRService service = new SQRService();
        service.squares(numberfirst, numbertwo);

        return;
    }
}