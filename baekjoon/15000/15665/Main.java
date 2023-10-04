// https://www.acmicpc.net/problem/15665
// N과 M (11)
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static boolean[] visitArray;
    private static int[] selectArray;
    private static int[] array;
    private static int select;
    private static Set<String> set = new HashSet<>();
    private static  BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        select = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        selectArray = new int[select];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index) throws IOException {
        if(count == select){
            StringBuilder result = new StringBuilder("");
            for (int i = 0; i < selectArray.length; i++) {
                result.append(selectArray[i] + " ");
            }
            if(!set.contains(result.toString())){
                set.add(result.toString());
                bw.write(result.toString() + "\n");
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
                selectArray[index] = array[i];
                getAnswer(count + 1, index + 1);
        }
    }

}
