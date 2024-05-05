// https://www.acmicpc.net/problem/29684
// Which Team Should Receive the Sponsor Prize?
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            int index = 0;
            int answer = Integer.MAX_VALUE;
            String[] sArray = bf.readLine().split(" ");
            for (int i = 0; i < sArray.length; i++) {
                int n = Integer.parseInt(sArray[i]);
                int result = Math.abs(n - 2023);
                if(answer > result){
                    index = i + 1;
                    answer = result;
                }
            }
            bw.write(index + "\n");
        }
        bw.flush();
        bw.close();
    }

    

}
