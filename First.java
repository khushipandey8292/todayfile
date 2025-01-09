
/*import java.util.Scanner;

public class First{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int m=0,flag=0;
        int n=3;
        m=n/2;
        if(n==0||n==1){
        System.out.println(n+"not prime");
        }else{
            for(x=2;x<=m;x++){
                if(n%x==0){
            System.out.println(n+"is prime");
        }

    }
    }

}}*/


public class First{
    public static void main(String[] args) {
        int no=1221;
        int temp=no;
        int rev=0,rem;
        while (temp!=0) {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if(no==rev){
            System.out.println(no+"is a palindrome number");
        }
            
        }
    }
