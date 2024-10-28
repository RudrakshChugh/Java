public class ReverseAString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb.reverse());
        // direct Shortcutb for reverse
        // Logic
        for(int i=0;i<sb.length()/2 ; i++){
            int Front = i;
            int Back = sb.length() - 1 - i; // 5-0-1 - 4
            
            char Frontchar = sb.charAt(Front);
            char Backchar = sb.charAt(Back);

            sb.setCharAt(Front, Backchar);
            sb.setCharAt(Back, Frontchar);
        }
        System.out.println(sb);
    }
    
}
