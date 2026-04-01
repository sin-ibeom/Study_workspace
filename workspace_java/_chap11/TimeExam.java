import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeExam {
    static void main(String[] args) {

        // timestamp , UNIX time
        long before = System.currentTimeMillis();
        System.out.println(before);

        for(int i = 0; i < 1000000000; i++){
        }

        long after = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (after - before) + " m/s");

        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);


        Date date = new Date();
        System.out.println(date); // toString 사용해서 객체 출력을 방지

        String format = "yyyy년 MM월 dd일 HH시간 mm분 ss초";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
//        String testDate = sdf.format("Wed Apr 01 20:03:34 KST 2026");
        String strDate = sdf.format(date);
//        System.out.println(testDate);
        System.out.println(strDate);


    }
}
