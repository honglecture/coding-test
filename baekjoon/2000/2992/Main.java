// https://www.acmicpc.net/problem/2992
// 크면서 작은 수
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    private static int[] array;
    private static boolean[] visitArray;
    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        int n = Integer.parseInt(str);
        int answer = 0;
        array = new int[str.length()];
        visitArray = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        getAnswer(0, "");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > n){
                answer = list.get(i);
                break;
            }
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int index, String result){
        if(index == array.length){
            list.add(Integer.parseInt(result));
            return;
        }
        for (int i = 0; i < visitArray.length; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                getAnswer(index + 1, result + array[i]);
                visitArray[i] = false;
            }
        }
    }

}