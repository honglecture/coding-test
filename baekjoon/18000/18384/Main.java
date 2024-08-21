// https://www.acmicpc.net/problem/18384
// PRIM
import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[5];
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            for (int j = 0; j < array.length; j++) {
                sum += getAnswer(array[j]);
            }
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n){
        int result = 0;
        while (true) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result = n;
                break;
            }
            n++;
        }

        return result;
    }

}
