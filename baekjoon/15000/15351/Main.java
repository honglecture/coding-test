// https://www.acmicpc.net/problem/15351
// 인생 점수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ' '){
                    continue;
                }
                int n = str.charAt(j) - 64;
                sum += n;
            }
            if(sum == 100){
                bw.write("PERFECT LIFE\n");
            } else {
                bw.write(sum + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

    
}
