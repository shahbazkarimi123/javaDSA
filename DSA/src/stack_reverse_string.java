import java.util.Stack;

public class stack_reverse_string {

    public static String reverse(String str)
    {
        Stack<Character> myStack = new Stack<>();
        char[] chars = str.toCharArray();
        for(char c:chars)
        {
            myStack.push(c);
        }
        for(int i=0;i<str.length();i++)
        {
            chars[i] = myStack.pop();

        }
        return new String(chars);
    }

    public static void main(String[] args)
    {
        String str = "ABCDEF";
        System.out.println("Before reverse: "+str);
        System.out.println("After reverse: "+reverse(str));

    }
}
