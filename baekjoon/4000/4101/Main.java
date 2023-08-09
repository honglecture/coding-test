// https://www.acmicpc.net/problem/4101
// 크냐?
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 0 && n2 == 0){
                break;
            }
            if(n1 > n2){
                bw.write("Yes\n");
            } else {
                bw.write("No\n");
            }
            
        }
        bw.flush();
        bw.close();
    }
}