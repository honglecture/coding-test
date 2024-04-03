// https://www.acmicpc.net/problem/14790
// Tidy Numbers (Small)
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            long n = Long.parseLong(bf.readLine());
            long answer = 0;
            for (long j = n; j >= 0; j--) {
                boolean flag = true;
                String str = String.valueOf(j);
                for (int k = 1; k < str.length(); k++) {
                    int n1 = Integer.parseInt(String.valueOf(str.charAt(k - 1)));
                    int n2 = Integer.parseInt(String.valueOf(str.charAt(k)));
                    if(n1 > n2){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    answer = j;
                    break;
                }
            }
            bw.write("Case #"+(i + 1)+": " + answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    
}