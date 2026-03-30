package sec02;

import java.io.FileInputStream;
import java.io.IOException;

public class TryWithExam {
    static void main(String[] args) {

        // 컴퓨터의 파일을 읽어옴
        FileInputStream fis = null;
        try {

            fis = new FileInputStream("c:\\test.txt");
            System.out.println("먼가 함.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try(
                FileInputStream fis2 = new FileInputStream("c:\\test.txt");
        ){

            System.out.println("먼가 함.");
            System.out.println(fis2);

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
