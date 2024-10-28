public class Strings {
    public static void main(String[] args) {
        String name = "Tony";
        String surname = "Stark";
        String fullname = name + "@" + surname;


        System.out.println(fullname.length()); // It also counts space

        // charAt - Print each word Seprately
        for(int i=0; i< fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

        // .compareto - used to compare two strings
        // if S1>S2 - +ve value
        // if s1=S2 - 0
        // if s1<S2 - -ve Value

        if (name.compareTo(fullname) == 0){
            System.out.println("Both are same");
        }else{
            System.out.println("Both are not same");
        }
        // .substring() - used To print Selected parts of String
        String Sentence = "My Name Is Tony";
        String a= Sentence.substring(0,Sentence.length());
        System.out.println(a);
    }
    
}
