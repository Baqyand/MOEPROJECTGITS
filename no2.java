import java.util.*;
import java.util.*;
class HelloWorld {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        CharChallenge(data);

    }

    public static void CharChallenge(String data) {
        // code goes here
        int size = data.length();

        if (data == "" || data.length() <= 1) {
            System.out.print(data);
        } else {
            System.out.print(data.charAt(size - 1));
            CharChallenge(data.substring(0, size - 1));
        }


    }
}