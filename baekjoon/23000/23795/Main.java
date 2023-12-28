// https://www.acmicpc.net/problem/23795
// 사장님 도박은 재미로 하셔야 합니다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;
        while (true) {
            int n = Integer.parseInt(bf.readLine());
            if(n == -1){
                break;
            }
            result += n;
        }
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
