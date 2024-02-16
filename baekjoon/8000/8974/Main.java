// https://www.acmicpc.net/problem/8974
// 희주의 수학시험
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]) - 1;
        int end = Integer.parseInt(sArray[1]) - 1;
        int[] array = new int[1000];
        int n = 1;
        int index = 0;
        boolean flag = false;
        while (true) {
            for (int i = 1; i <= n; i++) {
                if(index == array.length){
                    flag = true;
                    break;
                }
                array[index++] = n;
            }
            if(flag){
                break;
            }
            n++;
        }

        int answer = 0;
        for (int i = start; i <= end; i++) {
            answer += array[i];
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
   
}