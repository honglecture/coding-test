class Solution {

    public static void main(String[] args) {
        isPalindrome("0P");
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        boolean answer = false;
        String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if((c >= 97 && c <= 122) || (c >= 48 && c <= 57)){
                sb.append(c);
                str += String.valueOf(c);
            }
        }
        System.out.println(str);
        System.out.println(sb.toString());
        if(str.equals(sb.reverse().toString())){
            answer = true;
        }
        System.out.println(answer);
        return answer;
    }
}