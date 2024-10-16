// https://www.acmicpc.net/problem/32288
// 바코드 닉네임
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'I'){
                answer += "i";
            } else {
                answer += "L";
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
