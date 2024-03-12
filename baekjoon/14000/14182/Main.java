// https://www.acmicpc.net/problem/14182
// Tax
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String str = bf.readLine();
            if(str.equals("0")){
                break;
            }
            int n = Integer.parseInt(str);
            int answer = 0;
            if(n <= 1000000){
                answer = n;
            } else if(n <= 5000000){
                answer = n - (int)(n * 0.1);
            } else {
                answer = n - (int)(n * 0.2);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


}