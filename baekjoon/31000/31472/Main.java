// https://www.acmicpc.net/problem/31472
// 갈래의 색종이 자르기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 1;
        int answer = 0;
        while (true) {
            int reuslt = count * (count * 2);
            if(reuslt == n){
                answer = (count * 2) * 4;
                break;
            }
            count++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
