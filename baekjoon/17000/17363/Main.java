// https://www.acmicpc.net/problem/17363
// 우유가 넘어지면?
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int y = Integer.parseInt(sArray[0]);
        int x = Integer.parseInt(sArray[1]);
        String[][] array = new String[y][x];
        String[][] answerArray = new String[x][y];
        Map<String, String> map = new HashMap<>();
        map.put(".", ".");
        map.put("O", "O");
        map.put("-", "|");
        map.put("|", "-");
        map.put("/", "\\");
        map.put("\\", "/");
        map.put("^", "<");
        map.put("<", "v");
        map.put("v", ">");
        map.put(">", "^");

        for (int i = 0; i < array.length; i++) {
            sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                String result = array[j][array[0].length - 1 - i];
                answerArray[i][j] = map.get(result);
            }
        }
        for (int i = 0; i < answerArray.length; i++) {
            for (int j = 0; j < answerArray[i].length; j++) {
                bw.write(answerArray[i][j] + "");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
