// https://www.acmicpc.net/problem/5063
// TGN
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
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int n3 = Integer.parseInt(sArray[2]);
            int result = n2 - n3;
            if(n1 < result){
                bw.write("advertise\n");
            } else if(n1 == result){
                bw.write("does not matter\n");
            } else {
                bw.write("do not advertise\n");
            }
        }
        bw.flush();
        bw.close();
    }
}