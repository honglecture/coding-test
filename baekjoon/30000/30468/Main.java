// https://www.acmicpc.net/problem/30468
// 호반우가 학교에 지각한 이유 1
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[5];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int n1 = array[0];
        int n2 = array[1];
        int n3 = array[2];
        int n4 = array[3];
        int sum = n1 + n2 + n3 + n4;
        int n = array[4] * 4;
        if(sum >= n){
            answer = 0;
        } else {
            answer = n - sum;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
