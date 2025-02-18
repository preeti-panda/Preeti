Thread package;
class  ThraedEx4 implements runnable{
    public void run() {
        try
        {
            for(char ch='A';ch<=z.ch++)
              {
                System.out.println(:From Child Thread :ch= '+ch');
                try{
                    Thread.sleep(1000);
                }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class ThreadInterface{
    pubic static void main(String[] args){
        ThreadEx3 t1=new ThreadEx3();
        Thread t=new Thread(t1);
        t.satrt();
        try
        
    }
}
