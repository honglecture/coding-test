// https://www.acmicpc.net/problem/31628
// 가지 한 두름 주세요
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[10][10];
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < array.length; j++) {
                set.add(array[i][j]);
            }
            if(set.size() == 1){
                flag = true;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            Set<String> set = new HashSet<>();
            for (int j = 0; j < array.length; j++) {
                set.add(array[j][i]);
            }
            if(set.size() == 1){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        bw.flush();
        bw.close();
    }

    

}
