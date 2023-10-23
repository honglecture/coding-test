// https://www.acmicpc.net/problem/1015
// 수열 정렬
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int[] checkArray = new int[size];
        boolean[] visitArray = new boolean[size];
        String answer = "";
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            checkArray[i] = array[i];
        }
        Arrays.sort(checkArray);
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            for (int j = 0; j < checkArray.length; j++) {
                if(visitArray[j]){
                    continue;
                }
                if(checkArray[j] == n){
                    answer += j + " ";
                    visitArray[j] = true;
                    break;
                }
            }
            
        }
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

}