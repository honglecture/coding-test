// https://www.acmicpc.net/problem/14650
// 걷다보니 신천역 삼 (Small)
import java.io.*;
public class Main {

    private static int[] array;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[size];
        getAnswer(0);
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index){
        if(index ==  array.length){
            String str = "";
            int result = 0;
            for (int i = 0; i < array.length; i++) {
                str += array[i];
            }
            result = Integer.parseInt(str);
            if(result % 3 == 0){
                answer++;
            }
            return;
        }
        if(index == 0){
            for (int i = 1; i <= 2; i++) {
                array[index] = i;
                getAnswer(index + 1);
            }
        } else {
            for (int i = 0; i <= 2; i++) {
                array[index] = i;
                getAnswer(index + 1);
            }
        }
    }

    
}