// https://www.acmicpc.net/problem/11037
// 중복 없는 수
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    private static List<Integer> list = new ArrayList<>();
    private static int[] array = new int[10];
    private static boolean[] visitArray = new boolean[10];

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        getAnswer(1, 1);
        Collections.sort(list);
        //System.out.println(list.size());
        while (true) {
            String str = bf.readLine();
            if(str == null || str.equals("")){
                break;
            }
            int n = Integer.parseInt(str);
            int answer = -1;
            int start = 0;
            int end = list.size();
            while (true) {
                if(start + 1 >= end){
                    break;
                }
                if(987654321 <= n){
                    answer = 0;
                    break;
                }
                int mid = (start + end) / 2;
                if(list.get(mid) > n){
                    end = mid;
                } else {
                    start = mid;
                }
            }
            if(answer == -1){
                answer = list.get(end);
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }


    private static void getAnswer(int index, int count){
        StringBuilder sb = new StringBuilder();
        if(array[1] != 0){
            for (int i = 1; i < index; i++) {
                sb.append(array[i]);
            }
            list.add(Integer.parseInt(sb.toString()));
        }
        if(count == 10){
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if(!visitArray[i]){
                visitArray[i] = true;
                array[index] =  i;
                getAnswer(index + 1, count + 1);
                visitArray[i] = false;
                array[index] = 0;
            }
        }

    }
}
