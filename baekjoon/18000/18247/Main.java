// https://www.acmicpc.net/problem/18247
// 겨울왕국 티켓 예매
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int y = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            if(y >= 12 && x >= 4){
                int result = (11 * x) + 4;
                bw.write(result +"\n");
            } else {
                bw.write("-1\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
