// https://www.acmicpc.net/problem/2490
// 윷놀이
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int j = 0; j < 3; j++) {
            int count = 0;
            String[] sArray = bf.readLine().split(" ");
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                if(n == 1){
                    count++;
                }
            }
            if(count == 0){
                bw.write("D\n");
            } else if(count == 1){
                bw.write("C\n");
            } else if(count == 2){
                bw.write("B\n");
            } else if(count == 3){
                bw.write("A\n");
            } else if(count == 4){
                bw.write("E\n");
            }
        }
        
        bw.flush();
        bw.close();
    }
}