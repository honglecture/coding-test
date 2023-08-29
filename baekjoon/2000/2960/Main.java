// https://www.acmicpc.net/problem/2960
// 에라토스테네스의 체
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int count = 0;
        int start = 2;
        int answer = 0;
        int[] array = new int[n1 - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = start++;
        }
        while(true){
            start = 0;
            boolean flag = true;
            for (int i = 0; i < array.length; i++) {
                if(array[i] != 0){
                    start = array[i];
                    break;
                }
            }
            for (int i = 0; i < array.length; i++) {
                if(array[i] == 0){
                    continue;
                }
                if(array[i] % start == 0){
                    int temp = array[i];
                    array[i] = 0;
                    count++;
                    if(count == n2){
                        flag = false;
                        answer = temp;
                        break;
                    }
                }
            }
            if(!flag){
                break;
            }
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }
}