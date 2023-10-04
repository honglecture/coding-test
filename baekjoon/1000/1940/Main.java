// https://www.acmicpc.net/problem/1940
// 주몽
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int key = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int start = 0;
        int end = array.length - 1;
        int count = 0;
        Arrays.sort(array);
        while(true){
            if(start == end){
                break;
            }
            int sum = array[start] + array[end];
            if(sum == key){
                count++;
                start++;
            } else if(sum > key){
                end--;
            } else {
                start++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

}