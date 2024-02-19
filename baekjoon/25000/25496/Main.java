// https://www.acmicpc.net/problem/25496
// 장신구 명장 임스
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer = 0;
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        sArray = bf.readLine().split(" ");
        int[] array = new int[n2];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            if(n1 < 200){
                n1 += n;
                answer++;
            }
            if(n1 > 199){
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
