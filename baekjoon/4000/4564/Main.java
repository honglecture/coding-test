// https://www.acmicpc.net/problem/4564
// 숫자 카드놀이
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
            bw.write(str + " ");
            while (true) {
                if(str.length() == 1){
                    break;
                }
                int result = 1;
                for (int i = 0; i < str.length(); i++) {
                    result *= Integer.parseInt(String.valueOf(str.charAt(i)));
                }
                str = String.valueOf(result);
                bw.write(str + " ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    
}