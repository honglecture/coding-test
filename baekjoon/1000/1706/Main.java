// https://www.acmicpc.net/problem/1706
// 크로스워드
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
        String answer = "";
        List<String> list= new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            String str = "";
            for (int j = 0; j < array[i].length; j++) {
                str += array[i][j];
            }
            sArray = str.split("#");
            for (int j = 0; j < sArray.length; j++) {
                list.add(sArray[j]);
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            String str = "";
            for (int j = 0; j < array.length; j++) {
                str += array[j][i];
            }
            sArray = str.split("#");
            for (int j = 0; j < sArray.length; j++) {
                list.add(sArray[j]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            String result = list.get(i);
            if(result.equals("") || result.length() == 1){
                continue;
            }
            answer = result;
            break;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


}
