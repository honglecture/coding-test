// https://www.acmicpc.net/problem/15995
// 잉여역수 구하기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int start = 1;
        int answer = 0;
        while (true) {
            int result = (1 + (n2 * start));
            if(result % n1 == 0){
                answer = result / n1;
                break;
            }
            start++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
}