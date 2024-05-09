// https://www.acmicpc.net/problem/24389
// 2의 보수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String str1 = Integer.toString(n, 2);
        String str2 = "";
        int legnth1 = str1.length();
        int legnth2 = 0;
        int answer = 0;
        for (int i = 0; i < 32 - legnth1; i++) {
            str1 = "0" + str1;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == '1'){
                str2 += "0";
            } else {
                str2 += "1";
            }
        }
        long result = Long.parseLong(str2, 2) + 1;
        str2 = Long.toString(result, 2);
        legnth2 = str2.length();
        for (int i = 0; i < 32 - legnth2; i++) {
            str2 = "0" + str2;
        }
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) != str2.charAt(i)){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
