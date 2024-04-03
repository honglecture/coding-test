// https://www.acmicpc.net/problem/28808
// Таблица результатов
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray =  bf.readLine().split(" ");
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
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals("+")){
                    flag = true;
                    break;
                }
            }
            if(flag){
                answer++;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

  
}
