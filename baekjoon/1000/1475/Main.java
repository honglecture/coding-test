// https://www.acmicpc.net/problem/1475
// 방 번호
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[10];
        String s = bf.readLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(n == 9){
                n = 6;
            }
            if(n == 6){
                if(array[6] == 0){
                    for (int j = 0; j < array.length; j++) {
                        if(j == 6){
                            array[j] += 2;
                        } else {
                            array[j] += 1;
                        }
                    }
                    array[6]--;
                    count++;
                } else {
                    array[6]--;
                }
            } else {
                if(array[n] == 0){
                    for (int j = 0; j < array.length; j++) {
                        if(j == 6){
                            array[j] += 2;
                        } else {
                            array[j] += 1;
                        }
                    }
                    array[n]--;
                    count++;
                } else {
                    array[n]--;
                }
            }
            
        }
        System.out.println(count);
        bw.flush();
        bw.close();
    }
}