// https://www.acmicpc.net/problem/26752
// Zegarek
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]) * 60 * 60;
        int n2 = Integer.parseInt(sArray[1]) * 60;
        int n3 = Integer.parseInt(sArray[2]) + 1;
        int sum = n1 + n2 + n3;
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        if(sum >= 86400){
            sum -= 86400;
        }
        answer1 = sum / 3600;
        sum -= answer1 * 3600;
        answer2 = sum / 60;
        sum -= answer2 * 60;
        answer3 = sum;
        String result1 = answer1 > 9 ? String.valueOf(answer1) : "0" + answer1;
        String result2 = answer2 > 9 ? String.valueOf(answer2) : "0" + answer2;
        String result3 = answer3 > 9 ? String.valueOf(answer3) : "0" + answer3;
        bw.write(result1 + ":" + result2 + ":" + result3 + "\n");
        bw.flush();
        bw.close();
    }

}
