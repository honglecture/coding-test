// https://www.acmicpc.net/problem/12869
// 뮤탈리스크
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        int answer = 0;
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        while (true) {
            Arrays.sort(array);
            int cost = 9;
            boolean flag = false;
            for (int i = array.length - 1; i >= 0; i--) {
                if(array[i] <= 0){
                    continue;
                }
                flag = true;
                array[i] -= cost;
                cost /= 3;
            }
            if(!flag){
                break;
            }
            answer++;
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}