// https://www.acmicpc.net/problem/32089
// 부원의 변천
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == 0){
                break;
            }
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[size];
            int answer = 0;
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            for (int i = 0; i < array.length - 2; i++) {
                int result = array[i] + array[i + 1] + array[i + 2];
                answer = Integer.max(result, answer);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


}
