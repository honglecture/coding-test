// https://www.acmicpc.net/problem/16561
// 3의 배수
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int count = 0;
        for (int i = 3; i <= n; i += 3) {
            for (int j = 3; j <= n; j += 3) {
                for (int k = 3; k <= n; k += 3) {
                    if(i + j + k > n){
                        break;
                    }
                    if(i + j + k == n){
                        count++;
                    }
                }
                if(i + j > n){
                    break;
                }
            }
            if(i > n){
                break;
            }
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }

    


}
