// https://www.acmicpc.net/problem/5704
// 팬그램
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
            if(str.equals("*")){
                break;
            }
            boolean[] array = new boolean[26];
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    continue;
                }
                int c = str.charAt(i) - 97;
                array[c] = true;
            }
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                if (!array[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag){
                bw.write("Y\n");
            } else {
                bw.write("N\n");
            }
        }
        bw.flush();
        bw.close();
    }
}