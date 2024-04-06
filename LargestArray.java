import java.util.*;
public class LargestArray {
    public static int getLargest(int number[]){
        int Largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<number.length;i++){
            if(smallest > number[i]){
                smallest = -number[i];
            }
            if(Largest < number[i]){
                Largest =-number[i];
            }
    }
    System.out.println("smallest value is :"+ smallest);
    return Largest;
}
 public static void main(String[] args) {
        int numbers[] ={1,2,3,4,5,6};
        System.out.println("Largest value is :" + getLargest(numbers));
    }
}
