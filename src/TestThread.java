public class TestThread extends Thread{
    int count = 1;

    // run() 메서드를 Override 해서 작성해준다.
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("현재 카운트 : " + count);

            // Thread.sleep 메서드 -> 지정된 시간을 sleep 한다.
            // 밀리초 단위이므로 1초 = 1000 으로 환산한다.
            //
            try {

                Thread.sleep(1000);
                count ++;

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }

        }

    }

}
