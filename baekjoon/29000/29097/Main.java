// https://www.acmicpc.net/problem/29097
// Короли
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int n1 = Integer.parseInt(sArray[0]);
        int n2 = Integer.parseInt(sArray[1]);
        int n3 = Integer.parseInt(sArray[2]);
        int n4 = Integer.parseInt(sArray[3]);
        int n5 = Integer.parseInt(sArray[4]);
        int n6 = Integer.parseInt(sArray[5]);
        int result1 = n1 * n4;
        int result2 = n2 * n5;
        int result3 = n3 * n6;
        String[] array1 = {"Joffrey", "Robb", "Stannis"};
        int[] array2 = {result1, result2, result3};
        List<String> list = new ArrayList<>();
        int maxNum = 0;
        for (int i = 0; i < array2.length; i++) {
            if(maxNum < array2[i]){
                maxNum = array2[i];
                list.clear();
                list.add(array1[i]);
            } else if(maxNum == array2[i]){
                list.add(array1[i]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
