// https://www.acmicpc.net/problem/14594
// 동방 프로젝트 (Small)
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int size = Integer.parseInt(bf.readLine());
        boolean[] array = new boolean[n];
        int answer = 1;
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]) - 1;
            int n2 = Integer.parseInt(sArray[1]) - 1;
            for (int j = n1 + 1; j <= n2; j++) {
                array[j] = true;
            }
        }
        for (int i = 1; i < array.length; i++) {
            if(!array[i]){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}