// https://www.acmicpc.net/problem/24087
// アイスクリーム (Ice Cream)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int n3 = Integer.parseInt(bf.readLine());
        int sum = 250;
        int result = n1 - n2;
        if(result < 0){
            result = 0;
        }
        if(result % n3 == 0){
            sum += (result / n3) * 100;
        } else {
            sum += (result / n3 + 1) * 100;
        }
        System.out.println(sum);
        bw.flush();
        bw.close();
    }

}
