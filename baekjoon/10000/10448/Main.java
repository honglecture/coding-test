// https://www.acmicpc.net/problem/10448
// 유레카 이론
import java.io.*;
public class Main {

    private static int[] array;
    private static int[] visitArray;
    private static int key;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new int[44];
        
        int n = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (n * (n + 1)) / 2;
            n++;
        }
        for (int i = 0; i < size; i++) {
            visitArray = new int[3];
            key = Integer.parseInt(bf.readLine());
            getAnswer(0, 0);
            bw.write(answer + "\n");
            answer = 0;
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(answer == 1){
            return;
        }
        if(count == 3){
            int sum = 0;
            for (int i = 0; i < visitArray.length; i++) {
                sum += visitArray[i];
            }
            if(sum == key){
                answer = 1;
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            visitArray[index] = array[i];
            getAnswer(count + 1, index + 1);
            visitArray[index] = 0;
        }
        
    }
    

}