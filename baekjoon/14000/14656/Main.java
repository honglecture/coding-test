// https://www.acmicpc.net/problem/14656
// 조교는 새디스트야!!
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int start = 1;
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] != start){
                answer++;
            }
            start++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    
}