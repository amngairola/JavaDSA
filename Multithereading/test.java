package Multithereading;

 class t extends Thread{
    private string tname ;
     public t (string n){
         tname = n;
     }

     public void run(){
         for (int i = 0; i < 2; i++) {
             System.out.println("thread is running");
         }
     }
}

public class test {

}
