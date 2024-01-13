package thread.threadex;

public class Calculator {
    private int memory;

    public int getMemory() {
        return this.memory;
    }

    public void setMemory1(int memory) {
        this.memory = memory;
        try {

            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " : " +"현재금액" +this.memory); //currentThread.getname 현재쓰레드 이름 current(현재의)
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " : " +"현재금액" +this.memory); //currentThread.getname 현재쓰레드 이름 current(현재의)
        }
    }

    public void setMemory2(int memory) {


               this.memory = memory;

               try {
                   Thread.sleep(2000);
                   System.out.println(Thread.currentThread().getName() + " : " + "현재금액" + this.memory); //currentThread.getname 현재쓰레드 이름 current(현재의)
               } catch (InterruptedException e) {
                   System.out.println(Thread.currentThread().getName() + " : " + "현재금액" + this.memory); //currentThread.getname 현재쓰레드 이름 current(현재의)
               }

           }

    public void setCalculator(Calculator calculator) {

    }
}
