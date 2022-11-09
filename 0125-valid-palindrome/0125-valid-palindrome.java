class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder s2 = new StringBuilder();
        s2 = s2.append(s1);
        s2 = s2.reverse();
        if(s1.equalsIgnoreCase(s2.toString())){
            return true;
        }
        else {
            return false;
        }
    }
}