// https://www.acmicpc.net/problem/11328
// Strfry
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split(" ");
            Set<String> set = new HashSet<>();
            String str1 = sArray[0];
            String str2 = sArray[1];
            boolean flag = true;
            String[] array1 = new String[str1.length()];
            String[] array2 = new String[str2.length()];
            for (int j = 0; j < str1.length(); j++) {
                array1[j] = String.valueOf(str1.charAt(j));
            }
            for (int j = 0; j < str2.length(); j++) {
                array2[j] = String.valueOf(str2.charAt(j));
            }
            Arrays.sort(array1);
            Arrays.sort(array2);
            if(array1.length != array2.length){
                flag = false;
            } else {
                for (int j = 0; j < array1.length; j++) {
                    if(!array1[j].equals(array2[j])){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                bw.write("Possible\n");
            } else {
                bw.write("Impossible\n");
            }
        }
        bw.flush();
        bw.close();
    }
}