public class Task implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++){

            try{
                System.out.println("TASK : " + (i + 1));
                Thread.sleep(500);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

}
