// https://www.acmicpc.net/problem/31796
// 한빛미디어 (Easy)
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int startIndex = 0;
        int answer = 0;
        while (true) {
            boolean flag = false;
            int n1 = array[startIndex];
            for (int i = startIndex + 1; i < array.length; i++) {
                int n2 = array[i];
                if(n1 * 2 <= n2){
                    answer++;
                    startIndex = i;
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer++;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
