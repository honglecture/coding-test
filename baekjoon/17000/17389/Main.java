// https://www.acmicpc.net/problem/17389
// 보너스 점수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int count = 0;
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'X'){
                count = 0;
            } else{
                answer += (i + 1) + count;
                count++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
