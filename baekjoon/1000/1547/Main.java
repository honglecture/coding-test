// https://www.acmicpc.net/problem/1547
// 공

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[4];
        array[1] = 1;
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            int temp = array[n1];
            array[n1] = array[n2];
            array[n2] = temp;
        }
        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i] == 1){
                answer = i;
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }


}
