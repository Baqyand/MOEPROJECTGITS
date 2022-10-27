import java.util.ArrayDeque;
import java.util.Scanner;

class HelloWorld {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        System.out.print(BrackedChallenge(data.replaceAll("\\s+","")));

    }

    public static String BrackedChallenge(String data) {
        if (data.length() % 2 != 0)
            return "NO";

        if (data.charAt(0) == '}' || data.charAt(0) == ']' || data.charAt(0) == ')')
            return "NO";

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < data.length(); i++) {

            if (data.charAt(i) == '(' || data.charAt(i) == '[' ||
                    data.charAt(i) == '{') {
                // Push the element in the stack
                stack.push(data.charAt(i));
                continue;
            }
            if (stack.isEmpty())
                return "NO";
                
            char check;
            if (data.charAt(i) == ')') {
                check = stack.pop();
                if ( check == '{' || check == '[') {
                    return "NO";
                }
            } else if (data.charAt(i) == ']') {
                check = stack.pop();
                if ( check == '(' || check == '{')
                    return "NO";
            } else if (data.charAt(i) == '}') {
                check = stack.pop();
                if ( check == '(' || check == '[')
                    return "NO";
            }
        }

        return stack.isEmpty() ? "YES" : "NO";

    }
}