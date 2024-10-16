// https://www.acmicpc.net/problem/32432
// Attention to the Meeting 
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n1 = Integer.parseInt(bf.readLine());
        int n2 = Integer.parseInt(bf.readLine());
        int answer = 1;
        while (true) {
            int result = answer * n1;
            if(result + (n1 - 1) > n2){
                answer--;
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
