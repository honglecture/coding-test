// https://www.acmicpc.net/problem/3005
// 크로스워드 퍼즐 쳐다보기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                String str1 = "";
                String str2 = "";
                if(i == 0 || array[i - 1][j].equals("#")){
                    for (int k = i; k < array.length; k++) {
                        String s = array[k][j];
                        if(s.equals("#")){
                            break;
                        }
                        str1 += s;
                    }
                }
                if(j == 0 || array[i][j - 1].equals("#")){
                    for (int k = j; k < array[0].length; k++) {
                        String s = array[i][k];
                        if(s.equals("#")){
                            break;
                        }
                        str2 += s;
                    }
                }
                if(str1.length() > 1){
                    list.add(str1);
                }
                if(str2.length() > 1){
                    list.add(str2);
                }
            }
        }



        Collections.sort(list);
        System.out.println(list.get(0));
        bw.flush();
        bw.close();
    }
}