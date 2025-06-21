import java.util.*;

class Solution {
    boolean solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        
        // if(s.toCharArray()[0]==')') {
        //     return false;
        // } else if(s.toCharArray()[0]=='('){    
        //      for(char ch: s.toCharArray()){
        //     if(deque.isEmpty()&&ch=='('){
        //         deque.addFirst(ch);
        //         } else if(deque.isEmpty()&&ch==')'){
        //         return false;
        //         } else if(deque.peekLast()=='('&&ch==')'){
        //         deque.removeLast();
        //         }
        //     }
        // }
        
        for(char ch : s.toCharArray()){
            if(ch=='('){
                deque.addLast(ch);
            } else{
                if(deque.isEmpty()){
                    return false;
                }
                deque.removeLast();
            }
        }
        
        return deque.isEmpty();
    }
}