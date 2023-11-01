// https://www.acmicpc.net/problem/2776
// 암기왕
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testCase; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array1 = new int[size];
            String[] sArray = bf.readLine().split(" ");
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int j = 0; j < array1.length; j++) {
                array1[j] = Integer.parseInt(sArray[j]);
                set1.add(array1[j]);
            }
            size = Integer.parseInt(bf.readLine());
            int[] array2 = new int[size];
            sArray = bf.readLine().split(" ");
            for (int j = 0; j < array2.length; j++) {
                array2[j] = Integer.parseInt(sArray[j]);
                set2.add(array2[j]);
            }
            for (int j = 0; j < array2.length; j++) {
                int n = array2[j];
                if(set1.contains(n)){
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}