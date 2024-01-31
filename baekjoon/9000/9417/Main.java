// https://www.acmicpc.net/problem/9417
// 최대 GCD
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            int[] array = new int[sArray.length];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            Arrays.sort(array);
            int max = 0;
            for (int j = 0; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    int result = getAnswer(array[j], array[k]);
                    if(max < result){
                        max = result;
                    }
                }
            }
            bw.write(max + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n1, int n2){
        int result = 0;
        for (int i = n1; i >= 1; i--) {
            if(n1 % i == 0 && n2 % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }
    
}