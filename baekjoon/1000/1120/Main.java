// https://www.acmicpc.net/problem/1120
// 문자열
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str1 = sArray[0];
        String str2 = sArray[1];
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i <= str2.length() - str1.length(); i++) {
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                char c1 = str1.charAt(j);
                char c2 = str2.charAt(j + i);
                if(c1 != c2){
                    count++;
                }
            }
            if(count < answer){
                answer = count;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}


