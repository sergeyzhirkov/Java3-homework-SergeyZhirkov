import java.util.concurrent.CyclicBarrier;

public class Car implements Runnable {

    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        MainClass.lock.lock();
        MainClass.lock.unlock();
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        MainClass.countDownLatch.countDown();
        if (MainClass.countDownLatch.getCount() == (CARS_COUNT - 1)) {
            System.out.println(String.format("%s - WIN", name));
        }
    }
}