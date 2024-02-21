package BasicRecursion;

public class Number {
    public static void main(String[] args) {
         print1(1);
    }

   static void print1(int i){
        if(i==5){
          return;
        }
       System.out.println(i);
        //
       print1(i+1);

    }

}
