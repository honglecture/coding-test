// https://www.acmicpc.net/problem/14909
// 양수 개수 세기
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            int n = Integer.parseInt(array[i]);
            if(n > 0){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
    
    
}