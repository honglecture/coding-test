// https://www.acmicpc.net/problem/1755
// 숫자놀이

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int start = Integer.parseInt(sArray[0]);
        int end = Integer.parseInt(sArray[1]);
        List<String[]> list = new ArrayList<>();
        String[] array = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };
        for (int i = start; i <= end; i++) {
            String str = i + "";
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                int n = Integer.parseInt(str.charAt(j) + "");
                result += array[n] + " ";
            }
            list.add(new String[]{result, i + ""});
        }
        Collections.sort(list, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        for (int i = 0; i < list.size(); i++) {
            if(i % 10 == 0 && i != 0){
                bw.write("\n");
            }
            bw.write(list.get(i)[1] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }

    

    
}

