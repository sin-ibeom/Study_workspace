import java.awt.*;

public class BeepExam {
    public static void main(String[] args){

//        Member a = new Member();
        // Call by Reference? 로 스레드 객체 공유
        Runnable task = new Task();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Main");

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 개체로 Runnable 활성화.");
            }
        });
        thread2.start();
    }
}
