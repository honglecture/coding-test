// https://www.acmicpc.net/problem/25630
// 팰린드롬 소떡소떡
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        for (int i = 0; i < size / 2; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(str.length() - 1 - i);
            if(c1 != c2){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
