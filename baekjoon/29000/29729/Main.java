// https://www.acmicpc.net/problem/29729
// 가변 배열
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int currentSize = Integer.parseInt(sArray[0]);
        int sum = 0;
        int plusSize = Integer.parseInt(sArray[1]);
        int minusSize = Integer.parseInt(sArray[2]);
        int size = plusSize + minusSize;
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            if(n == 1){
                if(currentSize == sum){
                    currentSize *= 2;
                }
                sum++;
            } else {
                sum--;
            }
        }
        System.out.println(currentSize);
        bw.flush();
        bw.close();
    }

    

}
