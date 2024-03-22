// https://www.acmicpc.net/problem/30503
// 방형구 탐색 (Easy)
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            int type = Integer.parseInt(sArray[0]);
            if(type == 1){
                int answer = 0;
                int n1 = Integer.parseInt(sArray[1]) - 1;
                int n2 = Integer.parseInt(sArray[2]) - 1;
                int n3 = Integer.parseInt(sArray[3]);
                for (int j = n1; j <= n2; j++) {
                    if(array[j] == n3){
                        answer++;
                    }
                }
                bw.write(answer + "\n");
            } else {
                int n1 = Integer.parseInt(sArray[1]) - 1;
                int n2 = Integer.parseInt(sArray[2]) - 1;
                for (int j = n1; j <= n2; j++) {
                    array[j] = 0;
                }
            }
        }
        bw.flush();
        bw.close();
    }

    

}
