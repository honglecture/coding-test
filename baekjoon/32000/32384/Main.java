// https://www.acmicpc.net/problem/32384
// 사랑은 고려대입니다
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String answer = "";
        for (int i = 0; i < size; i++) {
            if(i == size - 1){
                answer += "LoveisKoreaUniversity";
            } else {
                answer += "LoveisKoreaUniversity ";
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
