// https://www.acmicpc.net/problem/21613
// Silent Auction
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String answer = "";
        int max = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int n = Integer.parseInt(bf.readLine());
            if(max < n){
                max = n;
                answer = str;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
