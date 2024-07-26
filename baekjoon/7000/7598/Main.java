// https://www.acmicpc.net/problem/7598
// Bookings
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            String str = sArray[0];
            int count = Integer.parseInt(sArray[1]);
            if(str.equals("#")){
                break;
            }
            while (true) {
                sArray = bf.readLine().split(" ");
                String s = sArray[0];
                int n = Integer.parseInt(sArray[1]);
                if(s.equals("X")){
                    break;
                }
                if(s.equals("B")){
                    if(count + n > 68){
                        continue;
                    }
                    count += n;
                } else {
                    if(count - n < 0){
                        continue;
                    }
                    count -= n;
                }
            }
            bw.write(str + " " + count + "\n");
        }
        bw.flush();
        bw.close();
    }
}