package multithreads;
class ThreadEx3 implements runnable{
    public void run() {
        try
        {
            for(int i=0;i<5;i++) {
                System.out.println(:From Child Thread :i= '+i');
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
    }
}
public class ThreadInterface{
    pubic static void main(String[] args){
        ThreadEx3 t1=new ThreadEx3();
        Thread t=new Thread(t1);
        t.star();
        try
    }
}
