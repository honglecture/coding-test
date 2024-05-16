// https://www.acmicpc.net/problem/23276
// Locust Locus
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int min = Integer.min(n2, n3);
            int max = Integer.max(n2, n3);
            int count = 1;
            while (true) {
                boolean flag = false;
                for (int j = 2; j <= min; j++) {
                    if(min % j == 0 && max % j == 0){
                        flag = true;
                        min /= j;
                        max /= j;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}
