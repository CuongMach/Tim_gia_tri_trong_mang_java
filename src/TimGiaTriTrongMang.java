import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Cuong1", "Cuong2", "Cuong3"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên học sinh cần tìm: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Vị trí của học sinh " + name + "là: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Học sinh " + name + " không có trong danh sách");
        }
    }
}
