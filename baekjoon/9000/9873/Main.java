// https://www.acmicpc.net/problem/9873
// Cow Baseball
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        int answer = 0;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length - 2; i++) {
            int n1 = array[i];
            for (int j = i + 1; j < array.length - 1; j++) {
                int n2 = array[j];
                int result1 = n2 - n1;
                for (int k = j + 1; k < array.length; k++) {
                    int n3 = array[k];
                    int result2 = n3 - n2;
                    if(result1 <= result2){
                        if(result1 * 2 >= result2){
                            answer++;
                        } else {
                            break;
                        }
                        
                    }
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }
}