// https://www.acmicpc.net/problem/9786
// Common Fraction
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int min = Integer.min(n1, n2);
            int max = Integer.max(n1, n2);
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
            if(n1 > n2){
                bw.write(max + " " + min + "\n");
            } else {
                bw.write(min + " " + max + "\n");
            }
            
        }
        bw.flush();
        bw.close();
    }

}