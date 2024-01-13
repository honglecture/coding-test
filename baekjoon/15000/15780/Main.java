// https://www.acmicpc.net/problem/15780
// 멀티탭 충분하니?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int size = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < sArray.length; i++) {
            int num = Integer.parseInt(sArray[i]);
            if(num % 2 == 0){
                count += num / 2;
            } else {
                count += num / 2 + 1;
            }
        }
        if(count >= n){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        bw.flush();
        bw.close();
    }

    
}