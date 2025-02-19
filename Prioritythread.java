class PriorityThreads extends thread{
    public static void main(String threadname){
        super(threadName);
    }
    public void run(){
        try{
            for(int i=0;i<4;i++){
                System.out.println("From Thread"+Thread.currentThread()+"i="+i);
                Thread.sleep(500);
            }
        }catch(Exception e){}
    }
}
public class ThreadPriority{
    public static void main(String[] args){
        Thread t1=new PriorityThread("one");
        Thread t1=new PriorityThread("Two");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread one Priority="+t1.getPriority());
        System.out.println("Thread one Priority="+t2.getPriority());
        t1.start();
        t2.start();

        try{
            for(int i=0;i<5;i++){
                System.out.println("From Main=" +i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
