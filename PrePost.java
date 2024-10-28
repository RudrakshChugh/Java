public class PrePost {
    public static void main(String[] args) {
        // Pre Decrement
        // Value Change Then Assign
        int a = 10;
        int b = 10;
        b = --a;
        System.out.println(a);
        System.out.println(b);

        // Post Decreement
        int c = 10;
        int d = 0;
        d = c--;
        System.out.println(c);
        System.out.println(d);

        
    }
}
