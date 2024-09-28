// https://www.acmicpc.net/problem/9398
// A Password Policy Requirement
import java.io.*;
import java.util.HashSet;
import java.util.Set;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String temp = bf.readLine();
            String str = getString(temp);
            int result = getAnswer(str);
            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static String getString(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
                result += "1";
            } else if(c >= 97 && c <= 122){
                result += "2";
            } else {
                result += "3";
            }
        }
        return result;
    }

    private static int getAnswer(String str){
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++) {
            Set<String> set = new HashSet<>();
            int count = 0;
            boolean flag = false;
            for (int j = i; j < str.length() - 1; j++) {
                String s1 = String.valueOf(str.charAt(j));
                String s2 = String.valueOf(str.charAt(j + 1));
                if(set.size() < 2){
                    set.add(s1);
                    count++;
                    continue;
                }
                if(!s1.equals(s2)){
                    count++;
                    flag = true;
                    break;
                } else if(j == str.length() - 2){
                    count += 2;
                    flag = true;
                    break;
                } else {
                    count++;
                }
            }
            if(flag){
                result = Integer.min(count, result);
            }
        }
        if(result == Integer.MAX_VALUE){
            result = 0;
        }
        
        return result;
    }


}