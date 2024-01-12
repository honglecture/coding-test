// https://www.acmicpc.net/problem/1668
// 트로피 진열
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(bf.readLine());
        }
        for (int i = array2.length - 1; i >= 0; i--) {
            array2[array2.length - i - 1] = array1[i];
        }
        int result1 = getAnswer(array1);
        int result2 = getAnswer(array2);
        System.out.println(result1);
        System.out.println(result2);
        bw.flush();
        bw.close();
    }
    
    private static int getAnswer(int[] array){
        int result = 1;
        int max = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            int n1 = array[i];
            int n2 = array[i + 1];
            if(n1 < n2){
                if(max < n2){
                    result++;
                    max = n2;
                }
            }
        }

        return result;
    }

}
