// https://www.acmicpc.net/problem/1408
// 24
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] array1 = bf.readLine().split(":");
        String[] array2 = bf.readLine().split(":");
        
        int n1 = (Integer.parseInt(array1[0]) * 60 * 60) + (Integer.parseInt(array1[1]) * 60) + Integer.parseInt(array1[2]);
        int n2 = (Integer.parseInt(array2[0]) * 60 * 60) + (Integer.parseInt(array2[1]) * 60) + Integer.parseInt(array2[2]);
        int n3 = n2 - n1;
        if(n3 < 0){
            n3 += (24 * 60 * 60);
        }
        int result1 = n3 / 3600;
        n3 = n3 % 3600;
        int result2 = n3 / 60;
        n3 = n3 % 60;
        int result3 = n3;
        String str1 = String.valueOf(result1);
        String str2 = String.valueOf(result2);
        String str3 = String.valueOf(result3);
        String answer1 = str1.length() == 1 ? "0" + str1 : str1;
        String answer2 = str2.length() == 1 ? "0" + str2 : str2;
        String answer3 = str3.length() == 1 ? "0" + str3 : str3;
        System.out.println(answer1 + ":" + answer2 + ":" + answer3);
        bw.flush();
        bw.close();
    }
    
}