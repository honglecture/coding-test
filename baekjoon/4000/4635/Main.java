// https://www.acmicpc.net/problem/4619
// 루트
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            int size = Integer.parseInt(bf.readLine());
            if(size == -1){
                break;
            }
            int[][] array = new int[size][2];
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                String[] sArray = bf.readLine().split(" ");
                int n1 = Integer.parseInt(sArray[0]);
                int n2 = Integer.parseInt(sArray[1]);
                array[i][0] = n1;
                array[i][1] = n2;
            }
            for (int i = 0; i < array.length; i++) {
                int n1 = array[i][0];
                int n2 = 0;
                if(i == 0){
                    n2 = array[i][1];
                } else {
                    n2 = array[i][1] - array[i - 1][1];
                }
                sum += n1 * n2;
            }
            bw.write(sum + " miles\n");
        }
        bw.flush();
        bw.close();
    }
    
}