// https://www.acmicpc.net/problem/11558
// The Game of Death
import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size];
            for (int j = 0; j < array.length; j++) {
                array[j] = Integer.parseInt(bf.readLine()) - 1;
            }
            int answer = getAnswer(array);
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] array){
        int result = 0;
        boolean[] visitArray = new boolean[array.length];
        int key = array.length - 1;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        while (queue.size() != 0) {
            int n = queue.poll();
            if(n == key){
                break;
            }
            if(visitArray[n]){
                result = 0;
                break;
            }
            visitArray[n] = true;
            result++;
            queue.add(array[n]);
        }
        return result;
    }
}