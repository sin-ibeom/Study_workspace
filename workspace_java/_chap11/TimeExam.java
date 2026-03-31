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
    }
}
