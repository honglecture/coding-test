// https://www.acmicpc.net/problem/17530
// Buffoon
import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array = new int[size];
        boolean flag = true;
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        int key = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > key){
                flag= false;
                break;
            }
        }
        if(flag){
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        bw.flush();
        bw.close();
    }

}
