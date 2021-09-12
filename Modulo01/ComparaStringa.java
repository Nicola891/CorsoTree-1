public class ComparaStringa {
    /* Date tre stringhe a, b e c in input, stampare l’intero corrispondente al numero di
       stringhe uguali tra loro (ignorando maiuscole e minuscole). Esempio: se a, b e c sono
       uguali tra loro stamperà «3», se invece a e b sono uguali ma c è diversa stamperà 2
       etc. */
    public static void main(String[] args) {
        String a = "ciao come va ?";
        String b = "cIao come vA ?";
        String c = "ciao come va ";
        System.out.println("2".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIaoo come vA ?";
        c = "ciao come va a";
        System.out.println("1".equals(""+compareStrings(a, b, c)));
        a = "ciao come va ?";
        b = "cIao come va ?";
        c = "ciao come vA ?";
        System.out.println("3".equals(""+compareStrings(a, b, c)));
    }

    private static int compareStrings(String a, String b, String c) {
        //inserite il vostro codice qui

        if(a.equalsIgnoreCase(b) && a.equalsIgnoreCase(c)) {
            return 3;
        }
        if(a.equalsIgnoreCase(b) || a.equalsIgnoreCase(c) || b.equalsIgnoreCase(c)) {
            return 2;
        }
        return 1;

//        return a.equalsIgnoreCase(b) && a.equalsIgnoreCase(c) ? 3 :
//                a.equalsIgnoreCase(b)  a.equalsIgnoreCase(c)  b.equalsIgnoreCase(c) ? 2 :
//                        1;
//

    }
}
