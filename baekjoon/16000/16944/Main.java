// https://www.acmicpc.net/problem/16944
// 강력한 비밀번호
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(bf.readLine());
        String str = bf.readLine();
        int answer = 0;
        while (true) {
            if(!check1(str)){
                answer++;
                str += "1";
                continue;
            }
            if(!check2(str)){
                answer++;
                str += "a";
                continue;
            }
            if(!check3(str)){
                answer++;
                str += "A";
                continue;
            }
            if(!check4(str)){
                answer++;
                str += "!";
                continue;
            }
            if(!check5(str)){
                int n = 6 - str.length();
                answer += n;
            }
            break;
        }
        System.out.println(answer);
        bw.flush();
        bw.close();
    }


    private static boolean check1(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 48 && c <= 57){
                flag = true;
                break;
            }
        }
        return flag;
    }
    private static boolean check2(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 97 && c <= 122){
                flag = true;
                break;
            }
        }
        return flag;
    }
    private static boolean check3(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 65 && c <= 90){
                flag = true;
                break;
            }
        }
        return flag;
    }
    private static boolean check4(String str){
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '!' || c == '@'|| c == '#'|| c == '$'|| c == '%'|| c == '^'|| c == '&'|| c == '*'|| c == '('|| c == ')'|| c == '-'|| c == '+'){
                flag = true;
                break;
            }
        }
        return flag;
    }
    private static boolean check5(String str){
        boolean flag = false;
        if(str.length() >= 6){
            flag = true;
        }
        return flag;
    }

}
