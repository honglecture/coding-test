// https://www.acmicpc.net/problem/15727
// 조별과제를 하려는데 조장이 사라졌다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int answer = 0;
        if(n % 5 == 0){
            answer = n / 5;
        } else {
            answer = n / 5;
            answer++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
    
}