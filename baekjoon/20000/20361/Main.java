// https://www.acmicpc.net/problem/20361
// 일우는 야바위꾼
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        boolean[] array = new boolean[n + 1];
        array[x] = true;
        for (int i = 0; i < k; i++) {
            sArray = bf.readLine().split(" ");
            int n1 = Integer.parseInt(sArray[0]);
            int n2 = Integer.parseInt(sArray[1]);
            boolean temp = array[n1];
            array[n1] = array[n2];
            array[n2] = temp;
        }
        int answer = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
