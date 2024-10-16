// https://www.acmicpc.net/problem/30156
// Malvika is peculiar about color of balloons
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'a'){
                    sum1 += 1;
                } else {
                    sum2 += 1;
                }
            }
            int answer = str.length() - Integer.max(sum1, sum2);
            bw.write(answer +"\n");
        }
        bw.flush();
        bw.close();
    }

    

}
