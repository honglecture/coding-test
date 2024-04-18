// https://www.acmicpc.net/problem/11648
// 지속
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int count = 0;
        while (true) {
            if(str.length() == 1){
                System.out.println(count);
                break;
            }
            long result = 1;
            for (int i = 0; i < str.length(); i++) {
                long n = Long.parseLong(String.valueOf(str.charAt(i)));
                result *= n;
            }
            str = String.valueOf(result);
            count++;
        }
        bw.flush();
        bw.close();
    }

    
}

