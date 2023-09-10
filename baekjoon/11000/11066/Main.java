// https://www.acmicpc.net/problem/11066
// 파일 합치기
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        while(true){
            if(list.size() == 1){
                break;
            }
            List<Integer> innerList = new ArrayList<>();
            int size = list.size();
            if(list.size() % 2 != 0){
                size = list.size() - 1;
            }
            for (int i = 0; i < size; i+=2) {
                innerList.add(list.get(i) + list.get(i + 1));
                result += list.get(i) + list.get(i + 1);
            }
            if(list.size() % 2 != 0){
                innerList.add(list.get(list.size() - 1));
            }
            list = new ArrayList<>(innerList);
            System.out.println(list);
        }
        return result;
    }
}