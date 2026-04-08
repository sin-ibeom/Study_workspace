import java.io.FileInputStream;
import java.io.InputStream;

public class InputExam {
    static void main(String[] args) {

        String full_path = "c:\\temp\\exam.txt";


        try(InputStream is = new FileInputStream(full_path);){

//            int BUFFER_SIZE = 1024 * 8; // 실무에선 보통 8kb
            int BUFFER_SIZE = 1;

            // 바이트 배열
            byte[] buffer = new byte[BUFFER_SIZE];

//            int result = is.read(buffer);
//
//            System.out.println("읽은 바이트 수 : " + result);
////            String data = buffer; // 안댐. 인둥엑 귀찬ㄱㅎ게[[
//
//            String data = new String(buffer, 0, result);
//            System.out.println("읽은 내용 : " + data);


            int buffer_size = 0;
            String data = "";
            while(buffer_size != -1){
                buffer_size = is.read(buffer);

                if(buffer_size != -1){
                    data += new String(buffer, 0, buffer_size);
                    System.out.println("----------------");
                    System.out.println(data);
                }
            }

            int result;
            while( (result = is.read(buffer)) != -1){
                data += new String(buffer, 0, BUFFER_SIZE);
            }

            System.out.println("읽은 내용 : " + data);

        } catch(Exception e){

        }

    }
}
