// https://www.acmicpc.net/problem/14969
// Taro's Shopping
import java.io.*;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String[] sArray = bf.readLine().split(" ");
            int size = Integer.parseInt(sArray[0]);
            int key = Integer.parseInt(sArray[1]);
            int answer = 0;
            if(size == 0 && key == 0){
                break;
            }
            int[] array = new int[size];
            sArray = bf.readLine().split(" ");
            for (int i = 0; i < array.length; i++) {
                array[i] = Integer.parseInt(sArray[i]);
            }
            Arrays.sort(array);
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    int sum = array[i] + array[j];
                    if(sum > key){
                        break;
                    }
                    answer = Integer.max(answer, sum);
                }
            }
            if(answer == 0){
                bw.write("NONE\n");
            } else {
                bw.write(answer +"\n");
            }
        }
        bw.flush();
        bw.close();
    }
    
}