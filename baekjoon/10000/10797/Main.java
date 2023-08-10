// https://www.acmicpc.net/problem/10797
// 10부제
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int count = 0;
        for (int i = 0; i < sArray.length; i++) {
            if(Integer.parseInt(sArray[i]) == n){
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}