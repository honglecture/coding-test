// https://www.acmicpc.net/problem/14219
// 막대과자 포장
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        if((n1 * n2) % 3 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }


}