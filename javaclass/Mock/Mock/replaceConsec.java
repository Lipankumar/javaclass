package Mock;



import java.util.Scanner;

/**
 * replaceConsec
 */
public class replaceConsec {

    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//int strLength=sc.nextInt();
		String str="aaab";
		// for(int i=0;i<strLength;i++){
		// 	String str=sc.nextLine();
		// }
		
		
		
		
		System.out.println(moveAllChar(str));
		
        sc.close();              // Your code here
	}
	public static int moveAllChar(String str){
		int counta=0,countb=0;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)=='a'){
				counta++;
			}
			else{
				countb++;
			}

		}
		int result=Math.min(counta,countb);
		return result;
	}
	
}