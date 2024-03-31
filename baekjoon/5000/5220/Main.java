// https://www.acmicpc.net/problem/5220
// Error Detection
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
            String str = Integer.toString(Integer.parseInt(sArray[0]), 2);
            int count = 0;
            String answer = "Corrupt";
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '1'){
                    count++;
                }
            }
            if(sArray[1].equals("0")){
                if(count % 2 == 0){
                    answer = "Valid";
                }
            } else {
                if(count % 2 == 1){
                    answer = "Valid";
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
}