class Solution {
    public String solution(String phone_number) {
        
        int length = phone_number.length();
        String star = "*".repeat(length-4);
        String last4 = phone_number.substring(length-4);
        return star+last4;
    }
}