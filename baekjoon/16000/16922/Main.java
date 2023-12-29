// https://www.acmicpc.net/problem/16922
// 로마 숫자 만들기
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    private static int[] array = {1, 5, 10, 50};
    private static Set<Integer> set = new HashSet<>();
    private static int size;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        getAnswer(1);
        System.out.println(set.size());
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count){
        if(count == size){
            return;
        }
        List<Integer> list = new ArrayList<>();
        for (int n : set) {
            for (int i = 0; i < array.length; i++) {
                list.add(array[i] + n);
            }
        }
        set.clear();
        for (int i = 0; i < list.size(); i++) {
            set.add(list.get(i));
        }
        getAnswer(count + 1);
    }

}
