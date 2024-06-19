// https://www.acmicpc.net/problem/19963
// Санта Клаус
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n = Integer.parseInt(sArray[0]);
        int m = Integer.parseInt(sArray[1]);
        int k = Integer.parseInt(sArray[2]);
        boolean[] array = new boolean[n + 1];
        int count = 0;
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[Integer.parseInt(sArray[i])] = true;
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[Integer.parseInt(sArray[i])] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < array.length; i++) {
            if(!array[i]){
                sb.append((i)+" ");
                count++;
            }
        }
        bw.write(count + "\n");
        bw.write(sb.toString()+"\n");
        bw.flush();
        bw.close();
    }

}