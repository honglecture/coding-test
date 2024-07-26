// https://www.acmicpc.net/problem/5966
// Cow Cotillion
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            String str = sArray[1];
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '>'){
                    count++;
                } else {
                    count--;
                }
                if(count < 0){
                    break;
                }
            }
            if(count != 0){
                bw.write("illegal\n");
            } else {
                bw.write("legal\n");
            }
        }
        bw.flush();
        bw.close();
    }
}