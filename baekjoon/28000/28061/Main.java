// https://www.acmicpc.net/problem/28061
// 모비스
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]) - size + i;
            if(n < 0){
                n = 0;
            }
            if(answer < n){
                answer = n;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
