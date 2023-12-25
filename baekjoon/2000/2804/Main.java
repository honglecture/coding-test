// https://www.acmicpc.net/problem/2804
// 크로스워드 만들기
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String str1 = sArray[0];
        String str2 = sArray[1];
        String[][] array = new String[str2.length()][str1.length()];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ".";
            }
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < str1.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)){
                    flag = true;
                    x = i;
                    y = j;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        for (int i = 0; i < str1.length(); i++) {
            array[y][i] = str1.charAt(i) + "";
        }
        for (int i = 0; i < str2.length(); i++) {
            array[i][x] = str2.charAt(i) + "";
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                bw.write(array[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}