//twisted prime (to get a input check prime then reverse it and check that number is prime)
import java.util.Scanner;
public class TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int res = prime(a);
        int twistednum = reverse(res);
        if(res!=0){
            System.out.println("Given value is prime:"+ res );
        }else{
            System.out.println("Not prime :" + a);
        }
        System.out.println(twistednum);
        int twisres = prime(twistednum);
        if(twisres!=0){
            System.out.println("Given value is prime:"+ twisres );
        }else{
            System.out.println("Not prime :" + twistednum);
        }
        System.out.println(twisres);
    }

    public static int prime(int n){
        if(n<=1){
            return 0;
        }else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    return  0;
                }
            }
        }
       return n;
    }
    public static int reverse(int k){
        int temp = k;
        int rev = 0;
        while(k!=0){
            int rem = k%10;
            rev = rev*10+rem;
            k/=10;
        }
        return rev;
    }
}
