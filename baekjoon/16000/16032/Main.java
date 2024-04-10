// https://www.acmicpc.net/problem/16032
// Income Inequality
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int answer = 0;
            String[] sArray = bf.readLine().split(" ");
            double sum = 0;
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                sum += n;
            }
            double avg = sum / (double) size;
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                if(avg >= n){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
