import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        List<Character> openP = new ArrayList<>();
        for (char c:s.toCharArray()) {
            if(isOpenP(c)) {
                openP.add(c);
            }
            else {
                if (openP.isEmpty())
                    return false;
                int lastIndexOfOpenP = openP.size() - 1;
                char lastIndexValueOfOpenP = openP.get(lastIndexOfOpenP);
                if (c == ')') {
                    if (lastIndexValueOfOpenP != '(')
                        return false;
                    else {
                        openP.remove(lastIndexOfOpenP);
                    }
                }
                else if (c == '}') {
                    if (lastIndexValueOfOpenP != '{')
                        return false;
                    else {
                        openP.remove(lastIndexOfOpenP);
                    }
                }
                else  {
                    if (lastIndexValueOfOpenP != '[')
                        return false;
                    else {
                        openP.remove(lastIndexOfOpenP);
                    }
                }
            }
        }
        return openP.isEmpty();
    }

    public static boolean isOpenP(char c) {
        return c == '(' ||  c == '{' ||  c == '[';
    }
}
