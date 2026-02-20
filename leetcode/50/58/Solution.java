class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        s = s.trim();
        String[] array = s.split(" ");
        answer = array[array.length - 1].length();
        return answer;
    }
}