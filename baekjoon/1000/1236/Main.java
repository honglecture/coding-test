// https://www.acmicpc.net/problem/1236
// 성 지키기
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("X")){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                list.add(i);
            }
        }
        answer += list.size();
        for (int i = 0; i < array[0].length; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length; j++) {
                if(array[j][i].equals("X")){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                if(list.size() != 0){
                    list.remove(0);
                    continue;
                } else {
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
