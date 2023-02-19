import java.util.*;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r,sum = 0;
        int temp = num;

        while(num>0)
        {
            r = num % 10; //get last digit
            sum = (sum*10) + r;
            num /= 10;
        }

        if(temp == sum)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");

        }

    }
    
}
