// https://www.acmicpc.net/problem/18242
// 네모네모 시력검사
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        boolean flag = false;
        int startY = 0;
        int startX = 0;
        for (int i = 0; i < array.length; i++) {
            sArray =  bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
                if(!flag && array[i][j].equals("#")){
                    startY = i;
                    startX = j;
                    flag = true;
                }
            }
        }
        int legnth = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = startY; i < array.length; i++) {
            String s = array[i][startX];
            if(s.equals(".")){
                break;
            }
            count1++;
        }
        for (int i = startX; i < array[0].length; i++) {
            String s = array[startY][i];
            if(s.equals(".")){
                break;
            }
            count2++;
        }
        legnth = Integer.max(count1, count2);
        if(array[startY][startX + (legnth / 2)].equals(".")){
            System.out.println("UP");
        } else if(array[startY + (legnth - 1)][startX + (legnth / 2)].equals(".")){
            System.out.println("DOWN");
        } else if(array[startY + (legnth / 2)][startX].equals(".")){
            System.out.println("LEFT");
        } else {
            System.out.println("RIGHT");
        }
        bw.flush();
        bw.close();
    }

}
