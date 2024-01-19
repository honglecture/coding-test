// https://www.acmicpc.net/problem/5026
// 박사 과정
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("\\+");
            if(sArray.length == 1){
                bw.write("skipped\n");
            } else {
                bw.write(Integer.parseInt(sArray[0]) + Integer.parseInt(sArray[1])+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}