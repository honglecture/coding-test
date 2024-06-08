// https://www.acmicpc.net/problem/28353
// 고양이 카페
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int key = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int start = 0;
        int end = size - 1;
        while (true) {
            if(start >= end){
                break;
            }
            int n1 = array[start];
            int n2 = array[end];
            int sum = n1 + n2;
            if(n1 >= key){
                break;
            }
            if(n2 >= key){
                end--;
                continue;
            }
            if(sum > key){
                end--;
                continue;
            }
            if(sum <= key){
                answer++;
                start++;
                end--;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
