// https://www.acmicpc.net/problem/18063
// Jazz Enthusiast
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        for (int i = 0; i < n1; i++) {
            sArray = bf.readLine().split(":");
            int m = Integer.parseInt(sArray[0]) * 60;
            int s = Integer.parseInt(sArray[1]);
            int reuslt = m + s;
            answer += reuslt;
        }
        answer -= ((n2 ) * (n1 - 1));
        int result1 = answer / 3600;
        answer %= 3600;
        int result2 = answer / 60;
        answer %= 60;
        int result3 = answer;
        String str1 = String.valueOf(result1);
        String str2 = String.valueOf(result2);
        String str3 = String.valueOf(result3);
        String answer1 = str1.length() == 1 ?  "0" + str1 : str1;
        String answer2 = str2.length() == 1 ?  "0" + str2 : str2;
        String answer3 = str3.length() == 1 ?  "0" + str3 : str3;
        System.out.println(answer1 + ":" + answer2 + ":" + answer3);
        bw.flush();
        bw.close();
    }

}
