// https://www.acmicpc.net/problem/1526
// 가장 큰 금민수
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        for (int i = n; i >= 0; i--) {
            String s = i + "";
            boolean flag = true;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if(c != '4' && c != '7'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
        }
        bw.flush();
        bw.close();
    }

}
