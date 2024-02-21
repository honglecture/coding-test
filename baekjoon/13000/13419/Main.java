// https://www.acmicpc.net/problem/13419
// 카드 문자열
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int legnth = str.length();
            if(legnth == 1){
                bw.write(str + "\n");
                bw.write(str + "\n");
                continue;
            }
            if(legnth % 2 == 0){
                String result1 = "";
                String result2 = "";
                for (int j = 0; j < str.length(); j += 2) {
                    result1 += str.charAt(j);
                }
                for (int j = 1; j < str.length(); j += 2) {
                    result2 += str.charAt(j);
                }
                bw.write(result1 + "\n");
                bw.write(result2 + "\n");
            } else {
                String result1 = "";
                String result2 = "";
                for (int j = 0; j < str.length(); j += 2) {
                    result1 += str.charAt(j);
                }
                for (int j = 1; j < str.length(); j += 2) {
                    result2 += str.charAt(j);
                }
                String answer1 = result1 + result2;
                String answer2 = result2 + result1;
                bw.write(answer1 + "\n");
                bw.write(answer2 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}