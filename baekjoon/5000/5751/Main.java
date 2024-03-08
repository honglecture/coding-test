// https://www.acmicpc.net/problem/5751
// Head or Tail
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
            String str = bf.readLine();
            if(str.equals("0")){
                break;
            }
            String[] sArray = bf.readLine().split(" ");
            int n1 = 0;
            int n2 = 0;
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                if(n == 0){
                    n1++;
                } else {
                    n2++;
                }
            }
            bw.write("Mary won "+n1+" times and John won "+n2+" times\n");
        }
        bw.flush();
        bw.close();
    }
}