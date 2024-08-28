// https://www.acmicpc.net/problem/31243
// ВРЕМЕ
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            int result = getAnswer(n1, n2, n3, n4);
            max = Integer.max(max, result);
            min = Integer.min(min, result);
        }
        String answer1 = getString(min);
        String answer2 = getString(max);
        System.out.println(answer1);
        System.out.println(answer2);
        bw.flush();
        bw.close();
    }


    private static int getAnswer(int n1, int n2, int n3, int n4){
        int result = 0;
        int sum1 = (n1 * 60) + n2;
        int sum2 = (n3 * 60) + n4;
        if(sum1 <= sum2){
            result = sum2 - sum1;
        } else {
            sum1 = (24 * 60) - sum1;
            result = sum2 + sum1;
        }
        return result;
    }

    private static String getString(int n){
        String answer = "";
        int result1 = n / 60;
        int result2 = n % 60;
        answer += result1 + ":";
        if(result2 < 10){
            answer += "0" + result2;
        } else {
            answer += result2;
        }
        return answer;
    }

    

}
