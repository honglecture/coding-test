// https://www.acmicpc.net/problem/31613
// 반복 (Repetition)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int answer = 0;
        while (true) {
            if(n1 >= n2){
                break;
            }
            int result = n1 % 3;
            if(result == 0){
                n1 += 1;
            } else if(result == 1){
                n1 *= 2;
            } else {
                n1 *= 3;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
