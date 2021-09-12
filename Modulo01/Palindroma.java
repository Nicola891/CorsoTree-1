import java.util.Objects;

public class Palindroma {
    /*Scrivere un programma che, data in input una stringa s, restituisca true se s è
    palindroma, false altrimenti*/
    public static void main(String[] args) {
        System.out.println(isPalindrome("c"));
        System.out.println(isPalindrome("ciic"));
        System.out.println(isPalindrome("aaaa"));
        System.out.println(isPalindrome("absca"));
        System.out.println(isPalindrome("abbaa"));
        System.out.println(isPalindrome("zzzzz"));
        System.out.println(isPalindrome("zzczz"));
        System.out.println(isPalindrome("aabbaa"));
    }

    private static boolean isPalindrome(String s) {
        //inserite qui il vostro codice
        String[] invertita = new String[s.length()];
        String[] arrays = new String[s.length()];

        for (int j = 0; j < s.length(); j++) {
            arrays[j]= String.valueOf(s.charAt(j));
        }

        for (int i = 0; i < s.length(); i++) {
            invertita[i]= String.valueOf(s.charAt((s.length()-1)-i));

            if(!Objects.equals(invertita[i], arrays[i]))
                return false;
        }
            return true;
    }
}
