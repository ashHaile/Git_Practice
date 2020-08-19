package day2;

public class Test2 {
    public static void main(String[] args) {
        String result = "";
        int count = 2;
        for (int i = 1; i <= 9 ; i++) {
            result += i;
            System.out.println(result + " * "+ 9+" + "+count+" = "+(Integer.parseInt(result)*9+count));
            count++;
        }
    }
}

