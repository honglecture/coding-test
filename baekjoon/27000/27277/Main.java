// https://www.acmicpc.net/problem/27277
// 장기자랑
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] sArray = bf.readLine().split(" ");
        int[] array = new int[size];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i < sArray.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
        }
        Arrays.sort(array);
        int answer = 0;
        if(size % 2 == 0){
            for (int i = 0; i < array.length  / 2; i++) {
                list1.add(array[i]);
            }
            for (int i = array.length / 2; i < array.length; i++) {
                list2.add(array[i]);
            }
            list3.add(list2.get(0));
            list3.add(list1.get(0));
            for (int i = 1; i < list1.size(); i++) {
                list3.add(list1.get(i));
                list3.add(list2.get(i));
            }
            answer += list3.get(0);
            for (int i = 1; i < list3.size(); i++) {
                answer += Integer.max(0, list3.get(i) - list3.get(i - 1));
            }
            System.out.println(list3);
        } else {

        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    

}
