// https://www.acmicpc.net/problem/1339
// 단어 수학
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static int[] countArray;
    private static String[] charArray;
    private static String[] array;
    private static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new String[size];
        Set<String> set = new HashSet<>();
        countArray = new int[26];
        for (int i = 0; i < array.length; i++) {
            array[i] = bf.readLine();
            for (int j = 0; j < array[i].length(); j++) {
                set.add(String.valueOf(array[i].charAt(j)));
            }
        }
        charArray = new String[set.size()];
        int index = 0;
        for (String s : set) {
            charArray[index++] = s;
        }
        getAnswer(0, 0, 9);
        bw.write(answer + "\n");
        bw.flush();
        bw.close();
    }

    private static void getAnswer(int count, int index, int num){
        if(count == charArray.length){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                StringBuilder result = new StringBuilder("");
                for (int j = 0; j < array[i].length(); j++) {
                    result.append(String.valueOf(countArray[array[i].charAt(j) - 65]));
                }
                sum += Integer.parseInt(result.toString());
            }
            if(sum > answer){
                answer = sum;
            }
            return;
        }
        for (int i = 0; i < charArray.length; i++) {
            int n = charArray[i].charAt(0) - 65;
            if(countArray[n] == 0){
                countArray[n] = num;
                getAnswer(count + 1, index + 1, num - 1);
                countArray[n] = 0;
            }
        }
    }


}