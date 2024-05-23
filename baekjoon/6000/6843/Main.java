// https://www.acmicpc.net/problem/6843
// Anagram Checker
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] array = new int[26];
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        boolean flag = true;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == ' '){
                continue;
            }
            int index = str1.charAt(i) - 65;
            array[index]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i) == ' '){
                continue;
            }
            int index = str2.charAt(i) - 65;
            if(array[index] == 0){
                flag = false;
                break;
            } else {
                array[index]--;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Is an anagram.");
        } else {
            System.out.println("Is not an anagram.");
        }
        bw.flush();
        bw.close();
    }

    
}