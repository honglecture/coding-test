// https://www.acmicpc.net/problem/20733
// Triple Texting
import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        Set<String> set = new HashSet<>();
        String answer = "";
        int size = str.length() / 3;
        for (int i = 0; i < str.length(); i += size) {
            String result = str.substring(i, i + size);
            if(set.contains(result)){
                answer = result;
                break;
            }
            set.add(result);
        }
        if(answer.equals("")){
            answer = set.iterator().next();
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }

}
