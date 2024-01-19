// https://www.acmicpc.net/problem/1347
// 미로 만들기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[100][100];
        int[] array1 = {-1, 0, 1, 0};
        int[] array2 = {0, 1, 0, -1};
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int type = 2;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "#";
            }
        }
        array[50][50] = ".";
        int currentY = 50;
        int currentX = 50;
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(s.equals("F")){
                currentY += array1[type];
                currentX += array2[type];
                array[currentY][currentX] = ".";
            } else if(s.equals("R")){
                type++;
                if(type == 4){
                    type = 0;
                }
            } else if(s.equals("L")){
                type--;
                if(type == -1){
                    type = 3;
                }
            }
        }
        
        // 제일 위
        // 제일 오른쪽
        // 제일 왼쪽
        // 제일 아래
        int y1 = Integer.MAX_VALUE;
        int y2 = -1;
        int x1 = Integer.MAX_VALUE;
        int x2 = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j].equals(".")){
                    if(i < y1){
                        y1 = i;
                    }
                    if(i > y2){
                        y2 = i;
                    }
                    if(j < x1){
                        x1 = j;
                    }
                    if(j > x2){
                        x2 = j;
                    }
                }
            }
        }
        for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <= x2; j++) {
                System.out.print(array[i][j]+"");
            }
            System.out.println();
        }
        bw.flush();
        bw.close();
    }

}