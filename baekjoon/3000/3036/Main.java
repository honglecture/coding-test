// https://www.acmicpc.net/problem/3036
// 링
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 1; i < array.length; i++) {
            int n1 = array[0];
            int n2 = array[i];
            int start = 2;
            while(true){
                if(n1 % start != 0 || n2 % start != 0){
                    start++;
                } else {
                    n1 /= start;
                    n2 /= start;
                }
                if(n1 == 1 || n2 == 1 || n1 < start || n2 < start){
                    break;
                }
            }
            bw.write(n1 + "/" + n2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}