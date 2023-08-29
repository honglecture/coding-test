// https://www.acmicpc.net/problem/10996
// 별 찍기 - 21
import java.io.*;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        if(n == 1){
            System.out.println("*");
            return;
        }
        for (int i = 0; i < n * 2; i++) {
            String result = "";
            for (int j = i; j < n + i; j++) {
                if(j % 2 == 0){
                    result += "*";
                } else {
                    result += " ";
                }
            }
            bw.write(result +"\n");
        }
        bw.flush();
        bw.close();
    }

}