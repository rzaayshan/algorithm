package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> chars = new HashMap<>();
        chars.put(')','(');
        chars.put('}','{');
        chars.put(']','[');
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<s.length();i++){
          char c = s.charAt(i);

          if(chars.containsKey(c)){
              char k = stack.isEmpty() ? '*' : stack.pop();

              if(k!=chars.get(c))
                  return false;
              continue;
          }
          stack.push(c);



      }
      return stack.isEmpty();

    }
}
