// https://www.acmicpc.net/problem/30792
// gahui and sousenkyo 2
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int key = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[sArray.length + 1];
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        array[array.length - 1] = key;
        Arrays.sort(array);
        int answer = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] == key){
                answer = array.length - i;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
