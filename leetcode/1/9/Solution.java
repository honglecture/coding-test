class Solution {

    public boolean isPalindrome(int x) {
        boolean answer = false;
        StringBuilder sb1 = new StringBuilder(String.valueOf(x));
        StringBuilder sb2 = new StringBuilder(sb1.toString()).reverse();
        if(sb1.toString().equals(sb2.toString())){
            answer = true;
        }
        return answer;
    }
}