// https://www.acmicpc.net/problem/16435
// 스네이크버드
import java.io.*;
import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int[] array = new int[n1];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int answer = n2;
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(answer < n){
                break;
            }
            answer++;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    


}
