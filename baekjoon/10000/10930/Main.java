// https://www.acmicpc.net/problem/10930
// SHA-256
import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = bf.readLine();
        String cryptogram = encrypt(str);
        System.out.println(cryptogram);
        bw.flush();
        bw.close();
    }


    public static String encrypt(String text) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(text.getBytes());

        return bytesToHex(md.digest());
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

}