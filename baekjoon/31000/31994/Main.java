// https://www.acmicpc.net/problem/31994
// 강당 대관
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int maxCount = 0;
        String answer = "";
        for (int i = 0; i < 7; i++) {
            String[] sArray = bf.readLine().split(" ");
            String name = sArray[0];
            int n = Integer.parseInt(sArray[1]);
            if(maxCount < n){
                maxCount = n;
                answer = name;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
