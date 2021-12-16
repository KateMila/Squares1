package ru.netology.sqr;

public class SQRService {

    public int squares(int numberFirst, int numberTwo) {
        int result = 0;
        for (int i = 10; i <= 99; i++)
        {
            if (i * i >= numberFirst && i * i <= numberTwo)
            {
                result++;
            }
        }
        return result;
    }
}


