package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

        int numberFirst = 100;
        int numberTwo = 200;

        SQRService service = new SQRService();
        service.squares(numberFirst, numberTwo);

        return;
    }
}