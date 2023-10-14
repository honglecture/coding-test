// https://www.acmicpc.net/problem/6359
// 만취한 상범
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
        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(bf.readLine());
            int result = getAnswer(n);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int n){
        int answer = 0;
        boolean[] array = new boolean[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = true;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < array.length; j++) {
                if((j + 1) % i == 0){
                    array[j] = array[j] == true ? false : true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]){
                answer++;
            }
        }
        return answer;
    }
}