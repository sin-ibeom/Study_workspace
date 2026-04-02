import java.util.ArrayList;
import java.util.List;

public class CollectionExam {
    static void main(String[] args) {



        // List에 ArrayList new 하기
        List list = new ArrayList();

        System.out.println(list.isEmpty());





        // 자료형이 같지 않아도 같이 넣기 가능
        System.out.println("=== 추가 ===");
        System.out.println("1 추가 됨.");
        list.add(1);
        list.add("hello");

        System.out.println();


        System.out.println("=== 크기 ===");
        System.out.println(list.size());

        System.out.println();
        System.out.println("=== 중간 삽입 ===");
        list.add(1, "삽입");
        System.out.println(list);


        System.out.println();
        System.out.println("=== 있는지 여부 확인 ===");
        System.out.println(list.contains("삽입")); // 있는지 여부만 나옴 , 인덱스 반환 X



        System.out.println();
        System.out.println("=== 인덱스 출력하기 ===");
        System.out.println( list.get(0) ); // 변수에 담을 때는 형변환 해줘야함
//        int list_no = list.get(0);



        System.out.println();
        System.out.println("=== 변수에 넣기 ===");
        int list_no = (int)list.get(0);
        System.out.println(list_no);



        System.out.println();
        System.out.println("=== 삭제 ===");
        list.remove(1);
        System.out.println(list);




        System.out.println();
        System.out.println("=== 비어있는가? ===");
        System.out.println(list.isEmpty());


    }
}
