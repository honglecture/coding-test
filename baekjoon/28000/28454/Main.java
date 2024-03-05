// https://www.acmicpc.net/problem/28454
// Gift Expire Date
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split("\\-");
        int key = Integer.parseInt(sArray[0] + sArray[1] + sArray[2]);
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split("\\-");
            int n = Integer.parseInt(sArray[0] + sArray[1] + sArray[2]);
            if(key <= n){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
