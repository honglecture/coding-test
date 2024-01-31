// https://www.acmicpc.net/problem/21312
// 홀짝 칵테일
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int result1 = n1 * n2;
        int result2 = n2 * n3;
        int result3 = n1 * n3;
        int result4 = n1 * n2 * n3;
        int answer = 0;
        int[] array = {result1, result2, result3, result4, n1, n2, n3};
        answer = array[0];
        for (int i = 1; i < array.length; i++) {
            int n = array[i];
            if(n % 2 == 1){
                if(answer % 2 == 1){
                    if(answer < n){
                        answer = n;
                    }
                } else {
                    answer = n;
                }
            } else {
                if(answer % 2 == 0){
                    if(answer < n){
                        answer = n;
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
