// https://www.acmicpc.net/problem/24927
// Is It Even?
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        int k = Integer.parseInt(sArray[1]);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }
        while (true) {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                if(k == 0){
                    break;
                }
                if(array[i] % 2 == 0){
                    flag = true;
                    k--;
                    array[i] /= 2;
                }
            }
            if(k == 0){
                break;
            }
            if(!flag){
                break;
            }
        }
        if(k == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    

}
