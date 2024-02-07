// https://www.acmicpc.net/problem/28281
// 선물
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i] * x;
            int n2 = array[i + 1] * x;
            int sum = n1 + n2;
            if(answer > sum){
                answer = sum;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
