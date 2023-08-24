// https://www.acmicpc.net/problem/15663
// N과 M (9)
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static Set<String> set = new HashSet<>();
    private static int[] array;
    private static int[] selectArray;
    private static boolean[] visitArray;
    private static int select;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size = Integer.parseInt(sArray[0]);
        select = Integer.parseInt(sArray[1]);
        array = new int[size];
        visitArray = new boolean[size];
        selectArray = new int[select];
        sArray = bf.readLine().split(" ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        getAnswer(0, 0);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index){
        if(count == select){
            String result = "";
            for (int i = 0; i < selectArray.length; i++) {
                result += array[selectArray[i]] + " ";
            }
            result = result.substring(0, result.length() - 1);
            if(!set.contains(result)){
                set.add(result);
                System.out.println(result);
            }
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if(!visitArray[i]){
                selectArray[index] = i;
                visitArray[i] = true;
                getAnswer(count + 1, index + 1);
                visitArray[i] = false;
            }
        }
    }

}
