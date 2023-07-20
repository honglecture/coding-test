// https://www.acmicpc.net/problem/1991
// 트리 순회
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static String answer1 = "";
    public static String answer2 = "";
    public static String answer3 = "";
    public static String temp = "";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, List<String>> map = new HashMap<>();
        int size = Integer.parseInt(bf.readLine());
        String[][] array = new String[size][3];
        for (int i = 0; i < array.length; i++) {
            String[] sArray = bf.readLine().split(" ");
            for (int j = 0; j < sArray.length; j++) {
                array[i][j] = sArray[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            String top = array[i][0];
            String left = array[i][1];
            String right = array[i][2];
            List<String> list = new ArrayList<>();
            list.add(left);
            list.add(right);
            map.put(top, list);
        }
        String root = "A";
        getAnswer1(map, root);
        getAnswer2(map, root);
        getAnswer3(map, root);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

        bw.flush();
        bw.close();
    }

    private static void getAnswer1(Map<String, List<String>> map, String root){
        List<String> list = map.get(root);
        if(list == null){
            return;
        }
        String left = list.get(0);
        String right = list.get(1);
        answer1 += root;
        getAnswer1(map, left); 
        getAnswer1(map, right); 
    }

    private static void getAnswer2(Map<String, List<String>> map, String root){
        List<String> list = map.get(root);
        if(list == null){ 
            return;
        }
        String left = list.get(0);
        String right = list.get(1);
        getAnswer2(map, left); 
        answer2 = answer2 + root;
        getAnswer2(map, right); 
    }

    private static void getAnswer3(Map<String, List<String>> map, String root){
        // 왼쪽 오른쪽 루트
        List<String> list = map.get(root);
        if(list == null){ 
            return;
        }
        String left = list.get(0);
        String right = list.get(1);
        getAnswer3(map, left); 
        getAnswer3(map, right); 
        answer3 = answer3 + root;
    }

}