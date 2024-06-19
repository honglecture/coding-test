// https://www.acmicpc.net/problem/21679
// Клавиатура
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bf.readLine();
        String[] sArray = bf.readLine().split(" ");
        int[] array1 = new int[sArray.length + 1];
        for (int i = 0; i < sArray.length; i++) {
            array1[i + 1] = Integer.parseInt(sArray[i]);
        }
        bf.readLine();
        sArray = bf.readLine().split(" ");
        int[] array2 = new int[sArray.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        for (int i = 0; i < array2.length; i++) {
            array1[array2[i]]--;
        }
        for (int i = 1; i < array1.length; i++) {
            if(array1[i] < 0){
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
    }

}
