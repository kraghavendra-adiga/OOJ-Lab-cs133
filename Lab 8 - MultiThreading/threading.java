package Lab;

class BMS extends Thread{

    public void run(){
        while (true){
            System.out.println("BMS College of Engineering");
            try{
                Thread.sleep(10000);
            }
            catch (InterruptedException e){}
        }
    }

}

class CSE extends Thread{
    public void run(){
        while (true){
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
        }
    }
}




public class ThreadingProgram {
    public static void main(String[] args) {
        BMS bms = new BMS();
        CSE cse = new CSE();
        System.out.println("Name: K Raghavendra S Adiga");
        System.out.println("USN: 1BM23CS133");
        bms.start();
        cse.start();
    }
}