class Solution {
    public String addBinary(String a, String b) {
        String answer = "";
        int carry = 0;
        a = new StringBuffer(a).reverse().toString();
        b = new StringBuffer(b).reverse().toString();
        int maxSize = Integer.max(a.length(), b.length());
        for (int i = 0; i < maxSize; i++) {
            int n1 = i > a.length() - 1 ? 0 : Integer.parseInt(String.valueOf(a.charAt(i)));
            int n2 = i > b.length() - 1 ? 0 : Integer.parseInt(String.valueOf(b.charAt(i)));
            int n3 = n1 + n2 + carry;
            if(n3 >= 2){
                carry = 1;
                if(n3 == 2){
                    answer = "0" + answer;
                } else {
                    answer = "1" + answer;
                }
            } else {
                carry = 0;
                answer = n3 + answer;
            }
        }
        if(carry == 1){
            answer = "1" + answer;
        }
        return answer;
    }
}