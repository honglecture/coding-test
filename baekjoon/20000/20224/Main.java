// https://www.acmicpc.net/problem/20224
// Count Down Up 2020
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
            int answer = 0;
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            for (int i = 0; i < array.length - 3; i++) {
                int n1 = array[i];
                int n2 = array[i + 1];
                int n3 = array[i + 2];
                int n4 = array[i + 3];
                if(n1 == 2 && n2 == 0 && n3 == 2 && n4 == 0){
                    answer++;
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

}
