ackage com.company;

public class OwlorLiza {
    public static void main(String args[]) throws InterruptedException {
        System.out.println("Поток про Сову щас создастся!");
        CuteGirl owl = new CuteGirl("Сова появилась!");
        System.out.println("Поток про Сову создан!");

        System.out.println("Поток про Лизу щас создастся!");
        CuteGirl liza = new CuteGirl("Лиза появилась!");
        System.out.println("Поток про Лизу создан!");

        owl.start();
        System.out.println("Поток про Сову запущен!");

        liza.start();
        System.out.println("Поток про Лизу запущен!");

        try {
            owl.join();
            System.out.println("Поток про Сову завершен! Усё!");
            if (liza.isAlive()) {
                liza.join();
                System.out.println("Поток про Лизу завершен! Усё!");
                System.out.println("Победила Лиза!");
            } else {
                System.out.println("Победила Сова!");
            }
        } catch (InterruptedException e){
        }
    }
}
class CuteGirl extends Thread {
    public CuteGirl(String name) {
        this.name = name;
    }
    String name;
    public void run() {

        for(int i = 0; i<10;i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name);
        }
    }
}
