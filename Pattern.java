// RECTANGLE BORDER

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4; // number of rows
//         int m = 5; // number of columns

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= m; j++) { // Use 'j' here for columns
//                 if (i == 1 || j == 1 || i == n || j == m) { 
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


// Triangle

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4; // number of rows

//         for (int i = 1; i <= n; i++) {   // For lower triangle (i=n;i>=1;i--)
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// Triangle 180 degree

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 4; // number of rows

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-1; j++) { // Use 'j' here for columns
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=1;j++){
//                 System.out.print("*");
//             }
//         }
//     }
// }


// number pattern coloumn triangle

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }


// number pattern decrreasing coloumn Triangle

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         int a = 1;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print(a+" ");
//                 a++;
//             }
//             System.out.println();
//         }
        
//     }
// }

// BUTTERFLY

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;
//         // UPPER HALF
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // LOWER HALF
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print("*");
//             }
//             int spaces = 2 * (n-i);
//             for(int j=1; j<=spaces; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) { 
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// RHOMBUS
// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) { 
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= 5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }


// NUMBER PYRAMID
// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) { 
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(i+ " ");
//             }
//             System.out.println();
//         }
        
//     }
// }


// PALINDROME PYRAMID

// public class Pattern {
//     public static void main(String[] args) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n-i; j++) { 
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
        
//     }
// }
 
