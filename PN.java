// import java.util.Scanner;

// public class PN {
//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         int a = in.nextInt();
//         int original=a;
//         int rev=0;
//         while(a>0){
//             int r=a%10;
//             rev = rev*10+r;
//             a/=10;
//         }
//         if(rev==original){
//             System.out.println("Palindrome Number");
//         }else{
//             System.out.println("Not an Palindrome Number");
//         }
//     }
// }

// palindrome in methods

// import java.util.Scanner;

// public class PN{
//     static String pal(int n) {
//         int original=n;
//         int rev=0;
//         while(n>0){
//             int r=n%10;
//             rev=rev*10+r;
//             n/=10;
//         }
//         if(rev==original){
//             return "Palindrome Number";
//         }else{
//             return "Not an Palindrome Number";
//         }
        
//     }
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int n=in.nextInt();
//         String result=pal(n);
//         System.out.println(result);
//         in.close();
//     }
// }