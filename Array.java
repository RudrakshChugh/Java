// import java.util.*;
// public class Array {
//     public static void main(String[] args) {
//         // int[] marks = new int[3];    2 Ways of Defining array
//         int marks[] = new int[3];
//         marks[0] = 90; 
//         marks[1] = 80;
//         marks[2] = 70;
//         // int marks[] = {90,80,70}; Shorter Way of Defining Array

//         for(int i=0; i<3;i++){
//             System.out.println(marks[i]);
//     }
//     }
// }


import java.util.*;
public class Array {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i=0; i<size;i++){
            numbers[i] = sc.nextInt();
        };
        
        for(int i=0; i<size;i++){     // TO FIND SIZE OF ARRAY USE HERE numbers.length;
            System.out.println(numbers[i]);
    }
    }
}