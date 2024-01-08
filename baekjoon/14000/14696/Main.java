// https://www.acmicpc.net/problem/14696
// 딱지놀이
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray1 = bf.readLine().split(" ");
            String[] sArray2 = bf.readLine().split(" ");
            int[] array1 = new int[6];
            int[] array2 = new int[6];
            for (int j = 1; j < sArray1.length; j++) {
                array1[Integer.parseInt(sArray1[j])]++;
            }
            for (int j = 1; j < sArray2.length; j++) {
                array2[Integer.parseInt(sArray2[j])]++;
            }
            if(array1[4] == array2[4]){
                if(array1[3] == array2[3]){
                    if(array1[2] == array2[2]){
                        if(array1[1] == array2[1]){
                            bw.write("D\n");
                        } else {
                            if(array1[1] > array2[1]){
                                bw.write("A\n");
                            } else {
                                bw.write("B\n");
                            }
                        }
                    } else {
                        if(array1[2] > array2[2]){
                            bw.write("A\n");
                        } else {
                            bw.write("B\n");
                        }
                    }
                } else {
                    if(array1[3] > array2[3]){
                        bw.write("A\n");
                    } else {
                        bw.write("B\n");
                    }
                }
            } else {
                if(array1[4] > array2[4]){
                    bw.write("A\n");
                } else {
                    bw.write("B\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    
}