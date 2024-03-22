// https://www.acmicpc.net/problem/10545
// 뚜기뚜기메뚜기
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sArray = bf.readLine().split(" ");
        String[] strArray = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder answer = new StringBuilder();
        StringBuilder result = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        int[] array = new int[sArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(sArray[i]);
            map.put(array[i], i + 1);
        }
        String str = bf.readLine();
        for (int i = 0; i < str.length(); i++) {
            String s = String.valueOf(str.charAt(i));
            String key = "";
            int count = 0;
            for (int j = 0; j < strArray.length; j++) {
                if(strArray[j].contains(s)){
                    for (int k = 0; k < strArray[j].length(); k++) {
                        if(strArray[j].charAt(k) == s.charAt(0)){
                            count = k + 1;
                            key = String.valueOf(j);
                            break;
                        }
                    }
                    if(!key.equals("")){
                        break;
                    }
                }
            }
            if(i != 0){
                if(answer.charAt(answer.length() - 1) == key.charAt(0)){
                    answer.append(" ");
                }
            }
            for (int j = 0; j < count; j++) {
                answer.append(key);
            }
        }
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) == ' '){
                answer.setCharAt(i, '#');
            }
        }
        for (int i = 0; i < answer.length(); i++) {
            if(answer.charAt(i) == '#'){
                result.append(String.valueOf(answer.charAt(i)));
            } else {
                int n = Integer.parseInt(String.valueOf(answer.charAt(i)));
                result.append(String.valueOf(map.get(n)));
            }
            
        }
        System.out.println(result.toString());
        bw.flush();
        bw.close();
    }


    

}