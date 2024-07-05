// https://www.acmicpc.net/problem/16462
// '나교수' 교수님의 악필
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        List<Integer> list = new ArrayList<>();
        double sum = 0;
        double avg = 0;
        int answer = 0;
        for (int i = 0; i < size; i++) {
            String str = bf.readLine();
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if(c == '0'){
                    result += "9";
                } else if(c == '6'){
                    result += "9";
                } else {
                    result += String.valueOf(c);
                }
            }
            int n = Integer.parseInt(result);
            if(n > 100){
                n = 100;
            }
            list.add(n);
            sum += n;
        }
        avg = sum / size;
        System.out.println(Math.round(avg));
        bw.flush();
        bw.close();
    }

    


}
