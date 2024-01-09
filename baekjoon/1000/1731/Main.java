// https://www.acmicpc.net/problem/1731
// 추론

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
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int n1 = array[0];
        int n2 = array[1];
        int n3 = array[2];
        if(n2 - n1 == n3 - n2){
            int n = n2 - n1;
            System.out.println(array[size - 1] + n);
        } else {
            int n = n2 / n1;
            System.out.println(array[size - 1] * n);
        }
        bw.flush();
        bw.close();
    }

}
