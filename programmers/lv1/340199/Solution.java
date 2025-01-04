// https://school.programmers.co.kr/learn/courses/30/lessons/340199
// [PCCE 기출문제] 9번 / 지폐 접기
class Solution {

    public static void main(String[] args) {
        int[] wallet = {30, 15};
        int[] bill = {26, 17};
        int result = solution(wallet, bill);
    }

    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        if(wallet[0] <  wallet[1]){
            int temp = wallet[0];
            wallet[0] = wallet[1];
            wallet[1] = temp;
        }
        while (true) {
            if(bill[0] < bill[1]){
                int temp = bill[0];
                bill[0] = bill[1];
                bill[1] = temp;
            }
            int n1 = bill[0];
            int n2 = bill[1];
            if(wallet[0] >= n1 && wallet[1] >= n2){
                break;
            }
            answer++;
            if(n1 > n2){
                n1 /= 2;
            } else {
                n2 /= 2;
            }
            bill[0] = n1;
            bill[1] = n2;
        }
        return answer;
    }
}