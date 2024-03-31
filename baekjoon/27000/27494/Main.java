// https://www.acmicpc.net/problem/27494
// 2023년은 검은 토끼의 해
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(n >= 2023){
            answer++;
            
        }
        bw.flush();
        bw.close();
    }


}
