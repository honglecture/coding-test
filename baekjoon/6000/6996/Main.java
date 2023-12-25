// https://www.acmicpc.net/problem/6996
// 애너그램
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            String s1 = sArray[0];
            String s2 = sArray[1];
            if(s1.length() != s2.length()){
                bw.write(s1 + " & " + s2 + " are NOT anagrams.\n");
            } else {
                int[] array1 = new int[150];
                int[] array2 = new int[150];
                for (int j = 0; j < s1.length(); j++) {
                    array1[(int)s1.charAt(j)]++;
                }
                for (int j = 0; j < s2.length(); j++) {
                    array2[(int)s2.charAt(j)]++;
                }
                boolean flag = true;
                for (int j = 0; j < array1.length; j++) {
                    if(array1[j] != array2[j]){
                        flag = false;
                        break;
                    }
                }
                if(!flag){
                    bw.write(s1 + " & " + s2 + " are NOT anagrams.\n");
                } else {
                    bw.write(s1 + " & " + s2 + " are anagrams.\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }

    
}