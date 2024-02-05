// https://www.acmicpc.net/problem/16719
// ZOAC
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static String[] array;
    private static boolean[] visitArray;
    private static List<String> answerList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        array = new String[str.length()];
        visitArray = new boolean[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(str.charAt(i));
        }
        getAnswer(0);
        for (int i = 0; i < answerList.size(); i++) {
            bw.write(answerList.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index){
        for (int i = index; i < array.length; i++) {
            
        }
    }

}
