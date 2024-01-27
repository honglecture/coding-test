// https://www.acmicpc.net/problem/15734
// 명장 남정훈
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        for (int i = 0; i < n3; i++) {
            if(n1 > n2){
                n2++;
            } else if(n1 < n2){
                n1++;
            } else {
                n1++;
            }
        }
        int result = n1 + n2 - Math.abs(n1 - n2);
        System.out.println(result);
        bw.flush();
        bw.close();
    }

    
}