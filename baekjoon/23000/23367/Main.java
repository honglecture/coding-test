// https://www.acmicpc.net/problem/23367
// Dickensian Dictionary
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String left = "qwertasdfgzxcvb";
        String right = "yuiophjklnm";
        boolean flag = true;
        boolean answer = true;
        String first = String.valueOf(str.charAt(0));
        if(left.contains(first)){
            flag = true;
        } else {
            flag = false;
        }
        for (int i = 1; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            if(flag){
                if(!right.contains(s)){
                    answer = false;
                    break;
                }
                flag = false;
            } else {
                if(!left.contains(s)){
                    answer = false;
                    break;
                }
                flag = true;
            }
        }
        if(answer){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        bw.flush();
        bw.close();
    }
    

}
