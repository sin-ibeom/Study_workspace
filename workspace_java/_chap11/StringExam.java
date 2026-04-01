public class StringExam {
    static void main(String[] args) {

        System.gc();

        String s1 = "영 일 이 삼 사 오 육 칠 팔 구 삼 사";

        char c = s1.charAt(0);
        System.out.println(c);
        c = 'c';

        int num1 = s1.indexOf("삼 사");
        System.out.println(num1);

        int num2 = s1.indexOf("삼 오");
        System.out.println(num2); // 없으면 -1

        int num3 = s1.lastIndexOf("삼 사");
        System.out.println(num3);

        // 이메일 양식 점검
        // @하나 .하나 있는가?

        String email = "eric091214@gmail.com";
        if(email.indexOf("@") != -1 && email.indexOf(".") != -1){
            System.out.println("이것은 정상적인 이메일입니다.");
        }

        String s2 = s1.replace("삼 사", "c");
        System.out.println(s2);
        // replace는 모두 바꿔준다.

        String s3 = s1.substring(5, 8);
        System.out.println(s3);

        // 1. 이메일에서 id만 출력
        String email2 = "eric091214@gmail.com";
        System.out.println(email2.substring(0, email2.indexOf("@")));
        ///  ////////////////////

        // 2. 성별 출력하기
        String memberId = "123456-1234567";
        System.out.println(memberId.substring(0, memberId.indexOf("-")));

















        String str1 = "a";

        str1 += "b";
        str1 += "c";
        // ^ 비효율적임!! - 더하기 할일이 7번 이상일 때 버퍼 사용하자

        // StringBuffer <- 적극적으로 써보자
        // 메모리를 효율적으로 사용한다.
        // 스레드에 안전하다 ( Thread-safe )

        StringBuffer sb = new StringBuffer("a");
        sb.append("b"); // 뒤에 붙인다!
        sb.append("c");

//        System.out.println(sb);
        String d = sb.toString();
        System.out.println(d);

        // StringBuffer보다 조금 빠름.
        // 스레드에 안전하지 않다.
        StringBuilder sb2 = new StringBuilder("a");
        sb2.append("b");

        // Buffer와 차이 없음 / 스레드 제외

        int vol = -3;
        if(vol < 0){
            vol = 0;
        }

        // Math.max : 가장 큰 값을 리턴한다 -> 0보다 작으면 무조건 0으로 반환
        // Math.min : 가장 작은 값을 리턴 -> 10보다 크면 10을 반환

        // -> 이걸 응용해서 if문을 사용하지 않고
        // 0 - 10의 숫자를 가져올 수 있음.
        vol = Math.max(0, Math.min(10, vol));

    }
}
