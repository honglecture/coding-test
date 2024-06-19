// https://www.acmicpc.net/problem/13670
// Alarme Despertador
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int n4 = Integer.parseInt(sArray[3]);
            if(n1 == 0 && n2 == 0 && n3 == 0 && n4 == 0){
                break;
            }
            int sum1 = (n1 * 60) + n2;
            int sum2 = (n3 * 60) + n4;
            int answer = 0;
            if(sum1 > sum2){
                answer = (60 * 24 - sum1) + sum2;
            } else if(sum1 < sum2){
                answer = sum2 - sum1;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}