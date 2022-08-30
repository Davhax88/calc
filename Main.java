import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(calc(" "));
    }

    public static String calc(String input) {
        Scanner sc = new Scanner(System.in);
            System.out.println("введите цифру");
        String st = sc.nextLine().replace(" ", "");
        String [] sts = st.split("[+-/*]");
        int b = Integer.parseInt(sts[1]);
        int a = Integer.parseInt(sts[0]);
        if(st.contains("+") && (a>=1 && a<=10 ) && (b>=1 && b<=10)) {
            System.out.println(a + b);}
        else if(st.contains("-") && (a>=1 && a<=10 ) && (b>=1 && b<=10) ){
            System.out.println(a - b);}
        else if(st.contains("*") && (a>=1 && a<=10 ) && (b>=1 && b<=10)){
            System.out.println(a*b);}
        else if(st.contains("/") && (a>=1 && a<=10 ) && (b>=1 && b<=10)){
            System.out.println(a/b);
        }


            return input;


}}