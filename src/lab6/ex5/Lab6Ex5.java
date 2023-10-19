package lab6.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {
	public static void main(String[] args) {
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(56);
		arr.add(32);
		arr.add(1);
		arr.add(45);
		arr.add(18);
		arr.add(15);
		arr.add(100);
		
       
        int getSecondSmall= getSecondSmall(arr);
        
        System.out.println("Second smallest is "+getSecondSmall);
        
    }

    public static int getSecondSmall(List<Integer> arr) {
    	Collections.sort(arr);
    	return arr.get(1);
    	
    	   }
}
