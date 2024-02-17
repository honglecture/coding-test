// https://www.acmicpc.net/problem/30031
// 지폐 세기
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            if(n1 == 136){
                answer += 1000;
            } else if(n1 == 142){
                answer += 5000;
            } else if(n1 == 148){
                answer += 10000;
            } else if(n1 == 154){
                answer += 50000;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
