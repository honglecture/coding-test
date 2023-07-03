// https://www.acmicpc.net/problem/2920
// 음계
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length];
        String result = "mixed";
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        if(array[0] == 8){
            boolean flag = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i] != 8 - i){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result = "descending";
            }
        } else if(array[0] == 1){
            boolean flag = true;
            for (int i = 1; i < array.length; i++) {
                if(array[i] != i + 1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                result = "ascending";
            }
        }
        bw.write(result+"\n");
        bw.flush();
        bw.close();
    }
}