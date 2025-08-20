package examplecode;

public class ReverseString {
    public static void main(String[] args) {
        String str = "assossaab";
        String result = "";

        for(int i = str.length()-1;i>=0;i--){
            result = result + str.charAt(i);
        }
        System.out.println("Actual string : "+ str);
        System.out.println("Reverse String : "+result);

        if(str.equals(result)){
            System.out.println("The string is palindrome");
        }
        else{
            System.out.println("The string is not palindrome");
        }
    }
}
