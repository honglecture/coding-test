// https://www.acmicpc.net/problem/10180
// Ship Selection
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int n = Integer.parseInt(sArray[1]);
            int answer = 0;
            for (int j = 0; j < size; j++) {
                sArray = bf.readLine().split(" ");
                double n1 = Integer.parseInt(sArray[0]);
                double n2 = Integer.parseInt(sArray[1]);
                double n3 = Integer.parseInt(sArray[2]);
                double result = (n2 / n3) * n1;
                if(result >= n){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
    
}


