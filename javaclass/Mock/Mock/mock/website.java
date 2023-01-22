package Mock.mock;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class website {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    String[] arr=new String[n];
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.next();
    }
    //String[] arr = { "facebook", "google", "facebook", "google", "ibm","facebook" };
    // int[] arr={1,2,1};
    HashSet<String> set = new HashSet<>();

    // for(int i=0;i<arr.length;i++){
    // for(int j=i+1;j<arr.length;j++){
    // if(arr[i]==arr[j]){
    // System.out.println(arr[i]);
    // }
    // }
    // //System.out.println(arr[i]);
    // }
    // for(int i=0;i<arr.length;i++){

    // if(set.add(arr[i])==false){
    // System.out.println(arr[i]);
    // }

    // }
    
    int counter2 = 0;
    String element = "";
    
    for (int i = 0; i < arr.length; i++) {
      int counter1 = 1;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          counter1++;
        }
      }
      if(counter1>counter2){
        counter2=counter1;
        element=arr[i];
      }

    }
    //System.out.println(counter2);
    System.out.println(element +"is repeated");
  }
}
