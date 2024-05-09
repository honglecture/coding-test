// https://www.acmicpc.net/problem/5343
// Parity Bit
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
            String str = bf.readLine();
            int answer = 0;
            for (int j = 0; j < str.length(); j += 8) {
                String subStr = str.substring(j, j + 8);
                int count = 0;
                for (int k = 0; k < subStr.length() - 1; k++) {
                    if(subStr.charAt(k) == '1'){
                        count++;
                    }
                }
                if(count % 2 == 0){
                    if(subStr.charAt(subStr.length() - 1) == '1'){
                        answer++;
                    }
                } else {
                    if(subStr.charAt(subStr.length() - 1) == '0'){
                        answer++;
                    }
                }
            }
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }
}