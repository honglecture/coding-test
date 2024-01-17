// https://www.acmicpc.net/problem/15312
// 이름 궁합
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        List<Integer> list = new ArrayList<>();
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            list.add(array[str1.charAt(i) - 65]);
            list.add(array[str2.charAt(i) - 65]);
        }
        while (true) {
            if(list.size() == 2){
                answer = list.get(0) + "" + list.get(1);
                break;
            }
            List<Integer> nextList = new ArrayList<>();
            for (int i = 0; i < list.size() - 1; i++) {
                int n1 = list.get(i);
                int n2 = list.get(i + 1);
                int n3 = n1 + n2;
                if(n3 > 9){
                    nextList.add(Integer.parseInt(String.valueOf(n3).charAt(1) + ""));
                } else {
                    nextList.add(n3);
                }
            }
            list = nextList;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

    
}
