// https://www.acmicpc.net/problem/24083
// 短針 (Hour Hand)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int result = (a + b) % 12;
        if(result == 0 ){
            result = 12;
        }
        
        System.out.println(result);
        bw.flush();
        bw.close();
    }

}
