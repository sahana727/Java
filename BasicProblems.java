public class BasicProblems{

    public static void main(String[] args){

        String palindrome = "medem";  
        char[] palindromeArray = palindrome.toCharArray();  
        String reversedValue = "";  

     
        for (int i = palindromeArray.length - 1; i >= 0; i--) {
            reversedValue = reversedValue + palindromeArray[i];  
        }

        
        if (reversedValue.equals(palindrome)) {
            System.out.println(reversedValue);
            System.out.println("The string is a palindrome");
        } else {
            System.out.println(reversedValue);
            System.out.println("The string is not a palindrome");
        }

    }
}
