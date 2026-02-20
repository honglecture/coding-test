class Solution {
    public int[] plusOne(int[] digits) {
        String result = "";
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int n = digits[i] + carry;
            if(n >= 10){
                carry = 1;
                result = "0" + result;
            } else {
                carry = 0;
                result = n + result;
            }
        }
        if(carry == 1){
            result = "1" + result;
        }
        int[] answer = new int[result.length()];
        for (int i = 0; i < result.length(); i++) {
            int n = Integer.parseInt(String.valueOf(result.charAt(i)));
            answer[i] = n;
        }
        return answer;
    }
}