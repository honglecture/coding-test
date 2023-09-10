// https://www.acmicpc.net/problem/3085
// 사탕 게임
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private static String[][] array;
    private static int aswner = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        array = new String[size][size];
        for (int i = 0; i < size; i++) {
            String[] sArray = bf.readLine().split("");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        getCount(); // 최초 한 번 실행
        getAnswer1(0);
        getAnswer2(0);
        bw.write(aswner + "\n");
        bw.flush();
        bw.close();
    }
    private static void getAnswer1(int count){
        if(count == 1){
            getCount();
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String s1 = array[i][j];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = s1;
                getAnswer1(count + 1);
                s1 = array[i][j];
                array[i][j] = array[i][j + 1];
                array[i][j + 1] = s1;
            }
        }
    }
    private static void getAnswer2(int count){
        if(count == 1){
            getCount();
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String s1 = array[j][i];
                array[j][i] = array[j + 1][i];
                array[j + 1][i] = s1;
                getAnswer1(count + 1);
                s1 = array[j][i];
                array[j][i] = array[j + 1][i];
                array[j + 1][i] = s1;
            }
        }
    }
    private static void getCount(){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String str = array[i][j];
                int result = 1;
                for (int k = j + 1; k < array.length; k++) {
                    String target = array[i][k];
                    if(str.equals(target)){
                        result++;
                    } else {
                        break;
                    }
                }
                if(aswner < result){
                    aswner = result;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String str = array[j][i];
                int result = 1;
                for (int k = j + 1; k < array.length; k++) {
                    String target = array[k][i];
                    if(str.equals(target)){
                        result++;
                    } else {
                        break;
                    }
                }
                if(aswner < result){
                    aswner = result;
                }
            }
        }
    }

}