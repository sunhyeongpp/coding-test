class Solution {
    public String solution(String my_string, int s, int e) {
        
        StringBuilder new_string = new StringBuilder(my_string);
        String sub = new_string.substring(s,e+1);
        String reversed = new StringBuilder(sub).reverse().toString();
        new_string.replace(s,e+1, reversed);
        
        return new_string.toString();
    }
}
