// https://www.acmicpc.net/problem/1431
// 시리얼 번호

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
        }
        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() < o2.length()){
                    return -1;
                } else if(o1.length() > o2.length()){
                    return 1;
                } else {
                    int n1 = 0;
                    int n2 = 0;
                    for (int i = 0; i < o1.length(); i++) {
                        char c = o1.charAt(i);
                        if(c >= 48 && c <= 57){
                            n1 += Integer.parseInt(String.valueOf(c));
                        }
                    }
                    for (int i = 0; i < o2.length(); i++) {
                        char c = o2.charAt(i);
                        if(c >= 48 && c <= 57){
                            n2 += Integer.parseInt(String.valueOf(c));
                        }
                    }
                    if(n1 < n2){
                        return -1;
                    } else if(n1 > n2){
                        return 1;
                    } else {
                        return o1.compareTo(o2);
                    }
                }
            }
        });
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        bw.flush();
        bw.close();
    }
    
}