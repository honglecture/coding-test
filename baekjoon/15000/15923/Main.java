// https://www.acmicpc.net/problem/15923
// 욱제는 건축왕이야!!
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[][] array = new int[size][2];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            array[i][0] = n1;
            array[i][1] = n2;
        }
        for (int i = 1; i < array.length; i++) {
            int n1 = array[i][0];
            int n2 = array[i][1];
            int n3 = array[i - 1][0];
            int n4 = array[i - 1][1];
            int result = Math.abs(n1 - n3) + Math.abs(n2 - n4);
            sum += result;
        }
        int result = Math.abs(array[0][0] - array[size - 1][0]) + Math.abs(array[0][1] - array[size - 1][1]);
        sum += result;
        System.out.println(sum);
        bw.flush();
        bw.close();
    }
    
}