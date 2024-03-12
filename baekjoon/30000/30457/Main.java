// https://www.acmicpc.net/problem/30457
// 단체줄넘기
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int leftMax = 0;
        int rightMax = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if(leftMax == 0){
                leftMax = array[i];
                answer++;
                continue;
            }
            if(rightMax == 0){
                rightMax = array[i];
                answer++;
                continue;
            }
            int n = array[i];
            if(leftMax > n){
                answer++;
                leftMax = n;
            } else if(rightMax > n){
                rightMax = n;
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
