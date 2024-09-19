// https://www.acmicpc.net/problem/12607
// T9 Spelling (Small)
import java.io.*;
import java.util.HashMap;
import java.util.Map;
public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        Map<String, Integer> map = new HashMap<>();
        map.put("abc", 2);
        map.put("def", 3);
        map.put("ghi", 4);
        map.put("jkl", 5);
        map.put("mno", 6);
        map.put("pqrs", 7);
        map.put("tuv", 8);
        map.put("wxyz", 9);
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            StringBuilder answer = new StringBuilder();
            answer.append("Case #"+(i + 1)+": ");
            for (int j = 0; j < str.length(); j++) {
                String s = String.valueOf(str.charAt(j));
                if(s.equals(" ")){
                    if(!answer.toString().equals("")){
                        if(answer.charAt(answer.length() - 1) == '0'){
                            answer.append(" ");
                        } else {
                            answer.append("0");
                        }
                    } else {
                        answer.append("0");
                    }
                    continue;
                }
                for (String key : map.keySet()) {
                    if(key.contains(s)){
                        int index = key.indexOf(s);
                        if(!answer.toString().equals("")){
                            if(answer.charAt(answer.length() - 1) == String.valueOf(map.get(key)).charAt(0)){
                                answer.append(" ");
                            }
                        }
                        for (int k = 0; k <= index; k++) {
                            answer.append(map.get(key) + "");
                        }
                        break;
                    }
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
    }
   
}


