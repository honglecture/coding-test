// https://www.acmicpc.net/problem/13238
// Bitcoin investment
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int maxNum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int n2 = array[j];
                if(n1 < n2){
                    int n3 = n2 - n1;
                    if(n3 > maxNum){
                        maxNum = n3;
                    }
                }
            }
        }
        System.out.println(maxNum);
        bw.flush();
        bw.close();
    }
}