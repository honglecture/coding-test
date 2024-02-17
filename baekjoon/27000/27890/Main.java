// https://www.acmicpc.net/problem/27890
// 특별한 작은 분수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        for (int i = 1; i <= n2; i++) {
            if(n1 % 2 == 0){
                n1 = (n1 / 2) ^ 6;
            } else {
                n1 = (n1 * 2) ^ 6;
            }
        }
        System.out.println(n1);
        
        bw.flush();
        bw.close();
    }

    

}
