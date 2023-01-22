package mock;

import java.util.Scanner;

/**
 * weekcalculations
 */
public class weekcalculations {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        calculateWeek(input);
        scanner.close();
    }
    public static void calculateWeek(String input) {
        int n=Integer.parseInt(input);
        String str=" + ";
        int res=n/7;
        int rem=n%7;
        System.out.println(res +" weeks "+ str +rem + " days ");
    }
}