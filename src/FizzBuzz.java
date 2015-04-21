/**
 * Created by aditim on 4/20/15.
 */
public class FizzBuzz {

    public static void FizzBuzz(int i){
        if(i%15==0){
            System.out.println("FizzBuzz");
            return;
        }
        else if(i%5==0){
          System.out.println("Buzz");
            return;
        }
        else if(i%3==0){
            System.out.println("Fizz");
            return;
        }
        else{
            System.out.println(i);
            return;
        }
    }
    public static void main(String[] args){
        for(int i=1;i<=16;i++){
            FizzBuzz(i);
        }
    }
}
