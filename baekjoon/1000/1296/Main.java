// https://www.acmicpc.net/problem/1296
// 팀 이름 정하기
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> answerList = new ArrayList<>();
        int maxNum = -1;
        String name = bf.readLine();
        int l = 0;
        int o = 0;
        int v = 0;
        int e = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if(c == 'L'){
                l++;
            } else if(c == 'O'){
                o++;
            } else if(c == 'V'){
                v++;
            } else if(c == 'E'){
                e++;
            }
        }
        int size = Integer.parseInt(bf.readLine());
        for (int i = 0; i < size; i++) {
            String team = bf.readLine();
            int result1 = l;
            int result2 = o;
            int result3 = v;
            int result4 = e;
            for (int j = 0; j < team.length(); j++) {
                char c = team.charAt(j);
                if(c == 'L'){
                    result1++;
                } else if(c == 'O'){
                    result2++;
                } else if(c == 'V'){
                    result3++;
                } else if(c == 'E'){
                    result4++;
                }
            }
            int sum = (result1 + result2) * (result1 + result3) * (result1 + result4) * (result2 + result3) * (result2 + result4)  * (result3 + result4);
            int result = sum % 100;
            if(maxNum < result){
                answerList.clear();
                answerList.add(team);
                maxNum = result;
            } else if(maxNum == result){
                answerList.add(team);
            }
        }
        Collections.sort(answerList);
        System.out.println(answerList.get(0));
        bw.flush();
        bw.close();
    }
}