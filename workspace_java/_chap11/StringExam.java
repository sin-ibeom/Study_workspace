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

    }
}
