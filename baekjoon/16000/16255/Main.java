// https://www.acmicpc.net/problem/16255
// Martian Volleyball
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int k = Integer.parseInt(sArray[0]);
            int x = Integer.parseInt(sArray[1]);
            int y = Integer.parseInt(sArray[2]);
            int max = Integer.max(x, y);
            int min = Integer.min(x, y);
            int result = max - min;
            int answer = 0;
            if(result == 0){
                answer += 2;
            } else if(result == 1){
                answer += 1;
            }
            max += answer;
            if(max < k){
                answer += k - max;
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
