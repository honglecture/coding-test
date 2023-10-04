// https://www.acmicpc.net/problem/3460
// 이진수
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
            String result = "";
            String s = Integer.toString(Integer.parseInt(bf.readLine()), 2);
            for (int j = s.length() - 1; j >= 0; j--) {
                if(s.charAt(j) == '1'){
                    result += (s.length() - 1 - j) + " ";
                }
            }
            if(!result.equals("")){
                result = result.substring(0, result.length() - 1);
            }
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}

