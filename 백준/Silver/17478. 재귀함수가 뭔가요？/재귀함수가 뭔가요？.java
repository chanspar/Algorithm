
import java.util.*;
import java.io.*;

public class Main {
    static String s1 = "\"재귀함수가 뭔가요?\"";
    static String s2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String s3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String s4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String s5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static String s6 = "라고 답변하였지.";
    static String del = "";

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        bw.newLine();
        go(n, bw);

        bw.flush();   
        bw.close();
    }

    static void go(int n, BufferedWriter bw) throws IOException {
        if (n == 0) {
            bw.write(del);
            bw.write(s1);
            bw.newLine();
            bw.write(del);
            bw.write(s5);
            bw.newLine();
            bw.write(del);
            bw.write(s6);
            bw.newLine();
            return ;
        }

        bw.write(del);
        bw.write(s1);
        bw.newLine();
        bw.write(del);
        bw.write(s2);
        bw.newLine();
        bw.write(del);
        bw.write(s3);
        bw.newLine();
        bw.write(del);
        bw.write(s4);
        bw.newLine();
        del += "____";
        go(n - 1, bw);
        del = del.substring(0, del.length() - 4);
        bw.write(del);
        bw.write(s6);
        bw.newLine();
    }
}
