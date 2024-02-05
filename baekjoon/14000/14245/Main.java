// https://www.acmicpc.net/problem/14245
// XOR
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        int[] array = new int[n];
        String[] sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            sArray = bf.readLine().split(" ");
            if(sArray[0].equals("1")){
                int start = Integer.parseInt(sArray[1]);
                int end = Integer.parseInt(sArray[2]);
                int num = Integer.parseInt(sArray[3]);
                for (int j = start; j <= end; j++) {
                    array[j] = array[j] ^ num;
                }
            } else {
                bw.write(array[Integer.parseInt(sArray[1])] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }


}