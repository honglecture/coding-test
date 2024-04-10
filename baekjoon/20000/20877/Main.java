// https://www.acmicpc.net/problem/20877
// Minigolf
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n >= 7){
                n = 7;
            }
            if(i % 2 == 0){
                answer += n - 2;
            } else {
                answer += n - 3;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
