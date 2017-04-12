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

        System.out.println(messageGen.getMessage()); //new MessageGen()getMessage()    вот так можно дернуть метод сразу

int j = 0;
++j;
        System.out.println(j);
    }

    //private static String getMessage()
    //{return "Hello World";}





}
