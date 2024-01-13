package thread.threadex.join;
//Single Thread

class ThreadEx2 implements Runnable {
    public static void main(String[] args) {

    }
   @Override
   public void run() {
       Thread thread = Thread.currentThread();
       for (int i = 0; i < 20; i++) {

           System.out.println(thread.getName());


       }

    /*   for (int i = 0; i > 20; i++) {
           System.out.println(thread.getName());
           try {
               Thread.sleep(2000);
           }
           catch ( e) {
           }
       }*/


   }
}
