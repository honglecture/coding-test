// https://www.acmicpc.net/problem/31669
// 특별한 학교 탈출
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        String answer = "ESCAPE FAILED";
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array[0].length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length; j++) {
                if(array[j][i].equals("O")){
                    flag = false;
                    break;
                }
            }
            if(flag){
                answer = String.valueOf(i + 1);
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
