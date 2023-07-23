// https://www.acmicpc.net/problem/9251
// LCS
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s1 = bf.readLine();
        String s2 = bf.readLine();
        if(s2.length() > s1.length()){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        int[][] array = new int[s2.length() + 1][s1.length() + 1];
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                char c2 = s2.charAt(j);
                if(c1 == c2){
                    int n = array[j][i] + 1;
                    array[j + 1][i + 1] = n;
                } else {
                    array[j + 1][i + 1] = Integer.max(array[j + 1][i], array[j][i + 1]);
                }
            }
        }
        int max = 0;
        
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if(max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        
        bw.write(max + "\n");
        bw.flush();
        bw.close();
    }
}