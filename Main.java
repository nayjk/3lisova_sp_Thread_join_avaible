public class Main{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Поток про Сову щас создастся!");
        Owl test1 = new Owl();
        System.out.println("Поток про Сову создан!");
        test1.start();
        System.out.println("Поток про Сову запущен!");
        test1.join();
        System.out.println("Поток про Сову завершен! Усё!");
        System.out.println("Поток про Лизу щас создастся!");
        Liza test2 = new Liza();
        System.out.println("Поток про Лизу создан!");
        test2.start();
        System.out.println("Поток про Лизу запущен!");
        test2.join();
        System.out.println("Поток про Лизу завершен! Усё!");
    }
}
class Owl extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Сова появилась!");
        }
    }
}class Liza extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Лиза появилась!");
        }
    }
}