// https://www.acmicpc.net/problem/11066
// 파일 합치기
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testSize = Integer.parseInt(bf.readLine());
        for (int i = 0; i < testSize; i++) {
            int size = Integer.parseInt(bf.readLine());
            int[] array = new int[size];
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[j] = Integer.parseInt(sArray[j]);
            }
            int result = getAnswer(array);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int getAnswer(int[] array){
        int result = 0;
        List<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        while(true){
            if(list.size() == 1){
                break;
            }
            int n1 = list.get(0);
            int n2 = list.get(1);
            list.remove(0);
            list.remove(0);
            result += n1;
            result += n2;
            list.add(n1 + n2);
            Collections.sort(list);
            System.out.println(list);
        }
        return result;
    }
}