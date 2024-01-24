// https://www.acmicpc.net/problem/11170
// 0의 개수
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
            int count = 0;
            for (int j = n1; j <= n2; j++) {
                String str = j + "";
                for (int k = 0; k < str.length(); k++) {
                    char c = str.charAt(k);
                    if(c == '0'){
                        count++;
                    }
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}