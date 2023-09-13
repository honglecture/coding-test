// https://www.acmicpc.net/problem/2448
// 별 찍기 - 11
import java.io.*;
public class Main {

    private static String[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        map = new String[n][n * 2];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = " ";
            }
        }
        getAnswer(n, 0, n);
        for (int i = 0; i < map.length; i++) {
            StringBuilder sb = new StringBuilder("");
            for (int j = 1; j < map[i].length; j++) {
                sb.append(map[i][j]);
            }
            bw.write(sb.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int size, int y, int x){
        if(size == 3){
            draw(y, x);
            return;
        }
        getAnswer(size / 2, y, x); // 중간
        getAnswer(size / 2, y + size / 2, x - (size / 2)); // 왼쪽
        getAnswer(size / 2, y + size / 2, x + (size / 2)); // 오른쪽
    }
    private static void draw(int y, int x){
        map[y][x] = "*";
        map[y + 1][x - 1] = "*";
        map[y + 1][x + 1] = "*";
        map[y + 2][x - 2] = "*";
        map[y + 2][x - 1] = "*";
        map[y + 2][x - 0] = "*";
        map[y + 2][x + 1] = "*";
        map[y + 2][x + 2] = "*";
    }
}