package main.src.searchbinary;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class binarySeachImpl {

    public  static  void main(String[] args){
        int[] list = {1,2,3,4,5,20,30,50,70,89,299,400};
        int[] mylist = {1, 3, 5, 7, 9};
        System.out.println(binarySearch(list,20)); // 1
        System.out.println(binarySearch(list,-1)); // null
    }

    /**
     * @DESCRIPTION
     *  Binary search algorithm application in java
     * @param list
     * @param item
     * @return
     */
    private static Integer binarySearch(int[] list, int item){
        // lowest value in the list
        int low = 0;
        // highest value in the list
        int high= list.length - 1;
        while(low<=high){
            // middle element in the list
            int mid = (low+high) /2;
            // guess
            int guess = list[mid];
            // founded item
            if(guess ==item){
                return mid;
            }
            // too high
            if(guess > item){
                high = mid -1;
            } else{
                // too low
                low = mid + 1;
            }
        }
        return null;
    }
}
