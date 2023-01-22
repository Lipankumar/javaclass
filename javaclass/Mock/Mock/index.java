
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class index{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
          }
       
        int r=3;int c=3;
        
         printDigonalmatrix(matrix,r,c);
       secondprintDigonalmatrix(matrix,n);
      
    }
    public static void printDigonalmatrix(int[][]matrix,int r,int c){
      System.out.print("first digonal"+":");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    System.out.print(matrix[i][j]+" ");
                }
                 
            }
        }
        
        System.out.println("");
       
        
    }
    
    public static void secondprintDigonalmatrix(int[][]matrix,int n){
       System.out.print("second digonal"+":");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)==(n-1)){
                    System.out.print(matrix[i][j]+" ");
                }
               
            }
        }
        
    System.out.println(""); 
       
        
    }
}
// 1 2 3
// 4  5 6
// 7 8 9
//ans 159
//357
// 3 
// 1 2 3
// 4 5 6
// 7 8 9