import java.util.*;
public class Revers {
    public static void revers(int numbers[]){
        int first = 0, Last = numbers.length -1;

        while(first < Last){
            int temp = numbers[Last];
            numbers[Last] = numbers[first];
            numbers[first] = temp;
            first++;
            Last--;
        }

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        revers(numbers);
        for(int i =0; i<numbers.length; i++){
        System.out.println(numbers[i]+"");
    }
    System.out.println();
}
}