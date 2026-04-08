import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {
    public static void main(String[] args){

        String pass = "C:\\temp";
        String filename = "exam.txt";

//        new FileOutputStream(경로, 파일이름);

//        String full_path = pass + "\\" + filename;
        String full_path = pass + System.getProperty("file.separator") + filename;

        // try with resource
        // try with resource에서는 괄호 안에서 변수 선언 및 초기화가 이루어져야 한다.

//        OutputStream os = null;
        try(OutputStream os = new FileOutputStream(full_path);)
        {

            // 파일에 쓸 데이터
            String str = "Hello, java! \n 안농 \n 1234 \n2";

            // byte 배열
            byte[] datas = str.getBytes();

            // 파일에 쓰기
            os.write(datas, 0, datas.length);

            // 버퍼에 남은 데이터 모두 출력
            os.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    void saveTxt(String data){
        
    }
}
