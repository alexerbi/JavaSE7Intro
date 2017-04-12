/**
 * Created by alexjd on 12.04.2017.
 */

import java.util.Date;

public class MutableTest {
//psvm
    public static void main(String[] args) {
        Date date = new Date();
        //sout
        System.out.println(date);
        changeDate(date);
        System.out.println(date);
        //changeDate();
    }

    private static void changeDate(Date date2)
    {
        date2.setTime(0);
    }


}
