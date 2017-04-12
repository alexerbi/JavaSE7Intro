/**
 * Created by alexjd on 12.04.2017.
 */
public class Strings {
    public static void main(String[] args) {
        String s="Мама мыла раму";
        String s1 = "Мама мыла раму";
        // тк строки объекты то сравнивать только так!!! никаких ==
        System.out.println(s.equals(s1));// true
    }
}
