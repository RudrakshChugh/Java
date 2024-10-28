public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // Char at index 0
        System.out.println(sb.charAt(0));
        // Set Character At Index
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        // Insert Character At Front
        sb.insert(2,'n');
        System.out.println(sb);
        // Delete An Extra N
        sb.delete(2,3);
        System.out.println(sb);
        // Add a Character
        sb.append("y");
        System.out.println(sb);
    }
    
}
