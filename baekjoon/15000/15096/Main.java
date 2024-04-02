// https://www.acmicpc.net/problem/15096
// Batter Up
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        double sum = 0;
        double count = 0;
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(n < 0){
                continue;
            }
            count++;
            sum += n;
        }
        System.out.println(sum / count);
        bw.flush();
        bw.close();
    }

    
}
