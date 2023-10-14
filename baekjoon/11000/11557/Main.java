// https://www.acmicpc.net/problem/11557
// Yangjojang of The Year
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            String maxName = "";
            int maxNum = 0;
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                String name = sArray[0];
                int n = Integer.parseInt(sArray[1]);
                if(maxNum < n){
                    maxNum = n;
                    maxName = name;
                }
            }
            bw.write(maxName + "\n");
        }
        bw.flush();
        bw.close();
    }
}