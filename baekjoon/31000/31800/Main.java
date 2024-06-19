// https://www.acmicpc.net/problem/31800
// Best Chance
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        String[] sArray = bf.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(sArray[i]);
            list.add(array1[i]);
        }
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = Integer.parseInt(sArray[i]);
        }
        Collections.sort(list);
        for (int i = 0; i < array1.length; i++) {
            int max = 0;
            int n1 = array1[i];
            int n2 = array2[i];
            if(list.get(list.size() - 1) == n1){
                max = list.get(list.size() - 2);
            } else {
                max = list.get(list.size() - 1);
            }
            int result = n1 - (max - n2) - n2;
            bw.write(result + " ");
        }
        bw.write("\n");

        bw.flush();
        bw.close();
    }

    

}
