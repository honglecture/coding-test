// https://www.acmicpc.net/problem/11758
// CCW
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray1 = bf.readLine().split(" ");
        String[] sArray2 = bf.readLine().split(" ");
        String[] sArray3 = bf.readLine().split(" ");
        int x1 = Integer.parseInt(sArray1[0]);
        int x2 = Integer.parseInt(sArray2[0]);
        int x3 = Integer.parseInt(sArray3[0]);
        int y1 = Integer.parseInt(sArray1[1]);
        int y2 = Integer.parseInt(sArray2[1]);
        int y3 = Integer.parseInt(sArray3[1]);
        int a = x1 * y2 + x2 * y3 + x3 * y1;
        int b = y1 * x2 + y2 * x3 + y3 * x1;
        if(a - b > 0){
            bw.write("1\n");
        } else if(a == b){
            bw.write("0\n");
        } else {
            bw.write("-1\n");
        }
        bw.flush();
        bw.close(); 
    }

}