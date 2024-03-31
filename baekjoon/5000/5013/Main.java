// https://www.acmicpc.net/problem/5013
// Death Knight Hero
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
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == 'C'){
                    if(j != str.length() - 1){
                        if(str.charAt(j + 1) == 'D'){
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}