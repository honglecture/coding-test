// https://www.acmicpc.net/problem/15234
// Number Pairs
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int answer = 0;
        sArray = bf.readLine().split(" ");
        int[] array = new int[n1];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] + array[j] == n2){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
