import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine(); // next line used for full line input with spaces
        // nextInt , nextFloat 
        System.out.println(name);
    }
    
}
