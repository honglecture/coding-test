// https://www.acmicpc.net/problem/15489
// 파스칼 삼각형
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int[][] array = new int[50][50];
        array[0][0] = 1;
        array[1][0] = 1;
        array[1][1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i][0] = 1;
            array[i][i] = 1;
            for (int j = 1; j <= i - 1; j++) {
                array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
            }
        }
        
        int answer = 0;
        int count = 0;
        for (int i = n1 - 1; i < n1 + n3 - 1; i++) {
            int sum = 0;
            for (int j = n2 - 1; j <= n2 - 1 + count; j++) {
                sum += array[i][j];
            }
            answer += sum;
            count++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
