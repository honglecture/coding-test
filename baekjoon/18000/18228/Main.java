// https://www.acmicpc.net/problem/18228
// 펭귄추락대책위원회
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            if(array[i] == -1){
                index = i;
            }
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < index; i++) {
            if(array[i] < min1){
                min1 = array[i];
            }
        }
        for (int i = index + 1; i < array.length; i++) {
            if(array[i] < min2){
                min2 = array[i];
            }
        }
        System.out.println(min1 + min2);
        bw.flush();
        bw.close();
    }

}
