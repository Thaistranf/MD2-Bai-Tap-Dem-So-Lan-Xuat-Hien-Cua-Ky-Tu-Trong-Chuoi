import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi:");
        String str = sc.nextLine();
        System.out.print("Nhập vào một ký tự: ");
        char character = sc.next().charAt(0);

        System.out.println("Số lần xuất hiện ký tự " + character +
                " là: " + demChuoi(str, character));
    }

    private static int demChuoi(String str, char character) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == character) count++;
        }
        return count;
    }
}