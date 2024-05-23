// https://www.acmicpc.net/problem/8635
// Zliczacz liter
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        int[] array1 = new int[26];
        int[] array2 = new int[26];
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            for (int j = 0; j < str.length(); j++) {
                int n = str.charAt(j);
                if(n >= 65 && n <= 90){
                    array1[n - 65]++;
                } else if(n >= 97 && n <= 122){
                    array2[n - 97]++;
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if(array2[i] != 0){
                String s = String.valueOf((char)(i + 97));
                bw.write(s + " " + array2[i] + "\n");
            }
        }
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != 0){
                String s = String.valueOf((char)(i + 65));
                bw.write(s + " " + array1[i] + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
   
}