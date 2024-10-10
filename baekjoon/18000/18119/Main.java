// https://www.acmicpc.net/problem/18119
// 단어 암기
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        int size1 = Integer.parseInt(sArray[0]);
        int size2 = Integer.parseInt(sArray[1]);
        String[] array = new String[size1];
        Set<String> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
            String result = "";
            boolean[] visitArray = new boolean[26];
            for (int j = 0; j < array[i].length(); j++) {
                visitArray[array[i].charAt(j) - 97] = true;
            }
            for (int j = 0; j < visitArray.length; j++) {
                if(visitArray[j]){
                    result += String.valueOf((char) (j + 97));
                }
            }
            array[i] = result;
        }
        for (int i = 0; i < size2; i++) {
            sArray = bf.readLine().split(" ");
            int type = Integer.parseInt(sArray[0]);
            String s = sArray[1];
            int count = 0;
            if(type == 1){
                set.add(s);
            } else {
                set.remove(s);
            }
            for (int j = 0; j < array.length; j++) {
                String str = array[j];
                boolean flag = true;
                for (int k = 0; k < str.length(); k++) {
                    if(set.contains(String.valueOf(str.charAt(k)))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    count++;
                }
            }
            bw.write(count + "\n");
        }
        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

}
