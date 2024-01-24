// https://www.acmicpc.net/problem/27918
// 탁구 경기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer1 = 0;
        int answer2 = 0;
        for (int i = 0; i < size; i++) {
            String s = bf.readLine();
            if(s.equals("D")){
                answer1++;
            } else {
                answer2++;
            }
            if(Math.abs(answer1 - answer2) >= 2){
                break;
            }
        }
        System.out.println(answer1 +":"+ answer2);
        bw.flush();
        bw.close();
    }

    

}
