// https://www.acmicpc.net/problem/10214
// Baseball
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            int answer1 = 0;
            int answer2 = 0;
            for (int j = 0; j < 9; j++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                answer1 += n1;
                answer2 += n2;
            }
            if(answer1 > answer2){
                bw.write("Yonsei\n");
            } else if(answer1 < answer2){
                bw.write("Korea\n");
            } else {
                bw.write("Draw\n");
            }
        }
        bw.flush();
        bw.close();
    }
}


