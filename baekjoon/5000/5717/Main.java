// https://www.acmicpc.net/problem/5717
// 상근이의 친구들
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String[] sArray = bf.readLine().split(" ");
            if(sArray[0].equals("0") && sArray[1].equals("0")){
                break;
            }
            int result = Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[1]);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}