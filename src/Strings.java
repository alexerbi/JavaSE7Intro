/**
 * Created by alexjd on 12.04.2017.
 */
public class Strings {
    public static void main(String[] args) {
        String s="Мама мыла раму";
        String s1 = "Мама мыла раму";
        // тк строки объекты то сравнивать только так!!! никаких ==
        System.out.println(s.equals(s1));// true
        int a=1;
        int b=2;

        a = a+b;
        System.out.println(a);

        //преобразование  типов лонга к инту
        // объявляем что число 5 именно ЛОНГ  L  а не инт
        long l=5L;



    }
}
