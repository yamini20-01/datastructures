package general.stack;

import java.util.ArrayList;
import java.util.Stack;

public class ValidateParenthesis {

    public static void main(String[] args) {
        String str = "{{}{}}{";

        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '}') {
                if (!characterStack.isEmpty()) {
                    characterStack.pop();
                }
            } else {
                characterStack.push(str.charAt(i));
            }
        }
        System.out.println(characterStack.isEmpty());

    }
}
