// https://www.acmicpc.net/problem/21895
// Rock-Paper-Scissors for three
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str1 = bf.readLine();
        String str2 = bf.readLine();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            String s1 = String.valueOf(str1.charAt(i));
            String s2 = String.valueOf(str2.charAt(i));
            if(s1.equals(s2)){
                String result = getAnswer(s1);
                answer.append(result);
            } else {
                String s3 = getString(s1, s2);
                //String result = getAnswer(s3);
                answer.append(s3);
            }
        }
        System.out.println(answer.toString());
        bw.flush();
        bw.close();
    }

    private static String getString(String s1, String s2){
        String result = "";
        if(s1.equals("R")){
            if(s2.equals("S")){
                result = "R";
            } else if(s2.equals("P")){
                result = "P";
            }
        } else if(s1.equals("S")){
            if(s2.equals("R")){
                result = "R";
            } else if(s2.equals("P")){
                result = "S";
            }
        } else {
            if(s2.equals("S")){
                result = "S";
            } else if(s2.equals("R")){
                result = "P";
            }
        }
        return result;
    }

    private static String getAnswer(String s){
        String result = "";
        if(s.equals("R")){
            result = "P";
        } else if(s.equals("S")){
            result = "R";
        } else {
            result = "S";
        }
        return result;
    }

}
