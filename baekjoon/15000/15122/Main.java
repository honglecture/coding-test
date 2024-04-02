// https://www.acmicpc.net/problem/15122
// Forbidden Zero
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine()) + 1;
        while (true) {
            boolean flag = true;
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(c == '0'){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(s);
                break;
            } else {
                n++;
            }
        }
        bw.flush();
        bw.close();
    }

    
}
