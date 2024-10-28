// public class functions {
//     public static void print(){
//         System.out.println("Hello World");
//         return;
//     }
//     public static void main(String[] args) {
//         print();
//     }
// }

// Factorial
// import java.util.*;
// public class functions {
//     public static void Factorial(int n){
//         if (n < 0){
//             System.out.println("Factorial is not defined for negative numbers");
//         }
//         int a=1;
//         for(int i=n;i>=1;i--){
//             a=a*i;
//         }
//         System.out.println(a);
//         return;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         Factorial(n);
//     }
// }



// In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
import java.util.*;
public class functions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
       int a = 0, b = 1;
          
       System.out.print(a+" ");
      
       if(n > 1) {
           //find nth term
           for(int i=2; i<=n; i++) {
               System.out.print(b+" ");
               //the concept below is called swapping
               int temp = b;
               b = a + b;
               a = temp;
           }
           System.out.println();
       }
          return;
    }
}