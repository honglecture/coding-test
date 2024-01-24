// https://www.acmicpc.net/problem/11536
// 줄 세우기
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array1 = new String[size];
        String[] array2 = new String[size];
        for (int i = 0; i < array1.length; i++) {
            String str = bf.readLine();
            array1[i] = str;
            array2[i] = str;
        }
        System.out.println(getAnswer(array1, array2));
        bw.flush();
        bw.close();
    }

    private static String getAnswer(String[] array1, String[] array2){
        String str = "NEITHER";
        Arrays.sort(array2);
        boolean flag = true;
        for (int i = 0; i < array2.length; i++) {
            if(!array1[i].equals(array2[i])){
                flag = false;
                break;
            }
        }
        if(flag){
            return "INCREASING";
        }
        Arrays.sort(array2, Collections.reverseOrder());
        flag = true;
        for (int i = 0; i < array2.length; i++) {
            if(!array1[i].equals(array2[i])){
                flag = false;
                break;
            }
        }
        if(flag){
            return "DECREASING";
        }
        
        return str;
    }
    
}