// https://www.acmicpc.net/problem/11098
// 첼시를 도와줘!
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            int maxNum = 0;
            String name = "";
            for (int j = 0; j < size; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n = Integer.parseInt(sArray[0]);
                String str = sArray[1];
                if(maxNum < n){
                    maxNum = n;
                    name = str;
                }
            }
            bw.write(name + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}