// https://www.acmicpc.net/problem/25943
// 양팔저울
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = {1,2,5,10,20,50,100};
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int left = Integer.parseInt(sArray[0]);
        int right = Integer.parseInt(sArray[1]);
        int result;
        int answer = 0;
        for (int i = 2; i < sArray.length; i++) {
            int n = Integer.parseInt(sArray[i]);
            if(left == right){
                left += n;
            } else {
                if(left > right){
                    right += n;
                } else {
                    left += n;
                }
            }
        }
        result = Math.abs(left - right);
        while (true) {
            if(result == 0){
                break;
            }
            for (int i = array.length - 1; i >= 0; i--) {
                int n = array[i];
                if(result >= n){
                    int n1 = result % n;
                    int n2 = result / n;
                    answer += n2;
                    result = n1;
                    break;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
