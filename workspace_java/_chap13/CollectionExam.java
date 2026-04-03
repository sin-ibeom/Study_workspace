import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        System.out.println("--------------");

        Map map = new HashMap();

        // 추가 - 변수에 담을 수 있는 모든 것을 넣을 수 있다.
        map.put("key", "value");
        map.put("k2", 123);
        map.put("k3", list);

        map.put("k2", 321); // 키가 없는 경우
                            //      Key 추가
                            // 키가 있는 경우
                            //      Key 덮어쓰기

        String map_str = (String)map.get("key");
        System.out.println(map_str);

        System.out.println(map.get("가사")); // 없으면 NULL

        // ------------------------------------------ //

        list = new ArrayList();
        map = new HashMap();

//        map.put("한로로", "사랑하게 될꺼야");
        map.put("가수명", "한로로");
        map.put("제목", "사랑하게 될꺼야");

        // 얕은 복사로 들어간다.
        list.add(map);
        System.out.println(list);
        System.out.println(":+:+:+:+:+:+:+:+:");
        map.put("가수명", "kiiikiii");

        System.out.println(list);

        // 제네릭
        // 노란줄 꼴보기 싫어서 쓴다네용 ㅎ. zㅋ

        // 추가할 자료형을 제한한다. !!

        // ⁂ 전달인자나 리턴타입의 자료형을 동적으로 변경한다.
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("string", 1234);
        System.out.println(map1);
    }
}
