// https://www.acmicpc.net/problem/11383
// 뚊
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] answerArray = new String[y][x];
        String[][] array = new String[y][x * 2];
        boolean flag = true;
        for (int i = 0; i < answerArray.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                answerArray[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                String str1 = answerArray[i][j];
                String str2 = array[i][j * 2];
                String str3 = array[i][j * 2 + 1];
                if(!str1.equals(str2) || !str1.equals(str3)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        if(flag){
            System.out.println("Eyfa");
        } else {
            System.out.println("Not Eyfa");
        }
        bw.flush();
        bw.close();
    }
}