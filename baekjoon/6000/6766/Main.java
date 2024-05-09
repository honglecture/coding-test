// https://www.acmicpc.net/problem/6766 
// Big Bang Secrets
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            int index = str.charAt(i);
            int result = index - ((3 * (i + 1)) + k);
            if(result < 65){
                result += 26;
            }
            answer += String.valueOf((char) result);
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}