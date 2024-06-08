// https://www.acmicpc.net/problem/11999
// Milk Pails (Bronze)
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int x = Integer.parseInt(sArray[0]);
        int y = Integer.parseInt(sArray[1]);
        int m = Integer.parseInt(sArray[2]);
        int count = 0;
        int max = Integer.MIN_VALUE;
        while (true) {
            if(x * count > m){
                break;
            }
            int result1 = count * x;
            int temp = m - result1;
            int result2 = (temp / y) * y;
            int sum = result1 + result2;
            max = Integer.max(max, sum);
            count++;
        }
        System.out.println(max);
        bw.flush();
        bw.close(); 
    }

}