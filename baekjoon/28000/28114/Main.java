// https://www.acmicpc.net/problem/28114
// 팀명 정하기
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] array = new String[3][3];
        List<String> list = new ArrayList<>();
        String answer1 = "";
        String answer2 = "";
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            array[i][0] = sArray[0];
            array[i][1] = sArray[1];
            array[i][2] = sArray[2];
            list.add(array[i][1].charAt(2) + "" + array[i][1].charAt(3));
        }
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                int n1 = Integer.parseInt(s1[0]);
                int n2 = Integer.parseInt(s2[0]);
                if(n1 > n2){
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer1 += list.get(i);
        }
        for (int i = 0; i < array.length; i++) {
            String name = array[i][2];
            answer2 += name.charAt(0);
        }
        System.out.println(answer1);
        System.out.println(answer2);
        bw.flush();
        bw.close();
    }

  
}
