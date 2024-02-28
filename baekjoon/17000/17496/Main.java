// https://www.acmicpc.net/problem/17496
// 스타후르츠
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        int answer = 0;
        if(n1 % n2 == 0){
            int result = n1 / n2 - 1;
            answer = result * n3 * n4;
        } else {
            int result = n1 / n2;
            answer = result * n3 * n4;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
