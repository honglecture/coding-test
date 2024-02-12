// https://www.acmicpc.net/problem/6888
// Terms of Office
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int start = Integer.parseInt(bf.readLine());
        int end = Integer.parseInt(bf.readLine());
        int n = start;
        while (true) {
            if(n > end){
                break;
            }
            bw.write("All positions change in year "+n+"\n");
            n += 60;
        }
        bw.flush();
        bw.close();
    }

    
}