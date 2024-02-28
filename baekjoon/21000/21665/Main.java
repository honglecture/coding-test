// https://www.acmicpc.net/problem/21665
// Миша и негатив
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array1 = new String[y][x];
        String[][] array2 = new String[y][x];
        int answer = 0;
        for (int i = 0; i < array1.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                String s = sArray[j];
                if(s.equals("W")){
                    array1[i][j] = "B";
                } else {
                    array1[i][j] = "W";
                }
            }
        }
        bf.readLine();
        for (int i = 0; i < array2.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array2[i][j] = sArray[j];
                if(!array2[i][j].equals(array1[i][j])){
                    answer++;
                }
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
