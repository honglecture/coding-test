// https://www.acmicpc.net/problem/9946
// 단어 퍼즐
import java.io.*;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count  = 1;
        while (true) {
            String str1 = bf.readLine();
            String str2 = bf.readLine();
            if(str1.equals("END") && str2.equals("END")){
                break;
            }
            if(str1.length() != str2.length()){
                bw.write("Case "+count+": different\n");
            } else {
                boolean flag = true;
                int[] array1 = new int[26];
                int[] array2 = new int[26];
                for (int i = 0; i < str1.length(); i++) {
                    int c1 = str1.charAt(i) - 97;
                    int c2 = str2.charAt(i) - 97;
                    array1[c1]++;
                    array2[c2]++;
                }
                for (int i = 0; i < array1.length; i++) {
                    if(array1[i] != array2[i]){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    bw.write("Case "+count+": same\n");
                } else {
                    bw.write("Case "+count+": different\n");
                }
            }
            count++;
        }
        bw.flush();
        bw.close();
    }
}