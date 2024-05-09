// https://www.acmicpc.net/problem/23336
// A Sorting Problem
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        while (true) {
            boolean checkFlag = false;
            for (int i = 0; i < array.length - 1; i++) {
                int n1 = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    int n2 = array[j];
                    if(n1 > n2){
                        if(Math.abs(n1 - n2) == 1){
                            array[i] = n2;
                            array[j] = n1;
                            checkFlag = true;
                            answer++;
                        }
                    }
                }
            }
            if(!checkFlag){
                break;
            }
            
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}
