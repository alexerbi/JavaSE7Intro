package com.luxoft.tc.java.basic.furniture;

/**
 * Created by alexjd on 11.04.2017.
 */
public class HelloWorldNew {
    // класс желательно всегда public
    // имя метода с маленькой буквы
    // static запуск без создания объекта как и в php
    //void не требует возврата
    // это входящая точка main она исполняется по умолчанию
    // в этом массиве ключи при запуске программы
    // в файле только один класс
    public static void main(String[] args){

        MessageGen messageGen = new MessageGen();

        System.out.println(messageGen.getMessage()); //new com.luxoft.tc.java.basic.furniture.MessageGen()getMessage()    вот так можно дернуть метод сразу

int j = 0;
++j;

// нумерация элементов аргументов как в массиве те с 0
        // это ведь массив args
        System.out.println(args[0]);
    }

    //private static String getMessage()
    //{return "Hello World";}





}
