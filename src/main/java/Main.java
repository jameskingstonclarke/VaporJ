public class Main {

    public static class Test implements Runnable{
        public void run(){
            try {
                while (true){
                    System.out.println("running!");
                    // Thread.yield()
                }
            }catch (Exception e){
                return;
            }
        }
    }

    public static void main(String[] args){
        Thread t = new Thread(new Main.Test());
        t.start();
        System.out.println("starting main!");
        try{
            t.interrupt();
        }catch(Exception e){
            System.out.println("stopped from main!");
        }
    }

    public static String lol(){
        return "lol";
    }
}
