/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author huytainguyen
 */
public class Stringinjava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tran Nhat Vinh");
        System.out.println("Chuỗi gốc: " + sb);

        sb.append(" - Dai Hoc Duy Tan");
        System.out.println("Sau khi thêm: " + sb);

        sb.insert(2, "hihi");
        System.out.println("Sau khi chèn: " + sb);

        sb.delete(0, 9);
        System.out.println("Sau khi xóa: " + sb);

        int len = sb.length();
        System.out.println("Độ dài của chuỗi: " + len);

        String str = "van hieu o day o";
        System.out.println("1. Độ dài chuỗi: " + str.length());

        if (str.isEmpty()) {
            System.out.println("2. Chuỗi trống");
        } else {
            System.out.println("2. Chuỗi không trống");
        }

        if (str.isBlank()) {
            System.out.println("3. Chuỗi chứa ký tự trắng");
        } else {
            System.out.println("3. Chuỗi không chứa ký tự trắng");
        }

        String str2 = "Hello world!";
        if (str.equals(str2)) {
            System.out.println("4. Hai chuỗi bằng nhau");
        } else {
            System.out.println("4. Hai chuỗi không bằng nhau");
        }

        if (str.equalsIgnoreCase(str2)) {
            System.out.println("5. Hai chuỗi bằng nhau không phân biệt chữ hoa chữ thường");
        } else {
            System.out.println("5. Hai chuỗi không bằng nhau kể cả khi không phân biệt chữ hoa chữ thường");
        }

        int compareResult = "Hello".compareTo("World");
        if (compareResult < 0) {
            System.out.println("6. Chuỗi 'Hello' nhỏ hơn chuỗi 'World'");
        } else if (compareResult > 0) {
            System.out.println("6. Chuỗi 'Hello' lớn hơn chuỗi 'World'");
        } else {
            System.out.println("6. Hai chuỗi bằng nhau");
        }

        if (str.startsWith("Hello")) {
            System.out.println("7. Chuỗi bắt đầu bằng 'Hello'");
        } else {
            System.out.println("7. Chuỗi không bắt đầu bằng 'Hello'");
        }

        if (str.endsWith("!")) {
            System.out.println("8. Chuỗi kết thúc bằng '!'");
        } else {
            System.out.println("8. Chuỗi không kết thúc bằng '!'");
        }

        int indexOfO = str.indexOf("o");
        if (indexOfO != -1) {
            System.out.println("9. Ký tự 'o' xuất hiện đầu tiên tại vị trí: " + indexOfO);
        } else {
            System.out.println("9. Không tìm thấy ký tự 'o' trong chuỗi");
        }

        char charAt4 = str.charAt(4);
        System.out.println("10. Ký tự tại vị trí thứ 4 là: " + charAt4);

        String subStr = str.substring(6);
        System.out.println("11. Chuỗi con từ vị trí 6: " + subStr);

        String lowerStr = str.toLowerCase();
        System.out.println("12. Chuỗi chuyển sang chữ thường: " + lowerStr);

        String upperStr = str.toUpperCase();
        System.out.println("13. Chuỗi chuyển sang chữ hoa: " + upperStr);

        String concatStr = "Hello ".concat(str);
        System.out.println("14. Chuỗi nối là: " + concatStr);

        String trimmedStr = " Hello World!     ".trim();
        System.out.println("15. Chuỗi sau khi loại bỏ khoảng trắng: '" + trimmedStr + "'");

        String replacedStr = str.replace('o', '9');
        System.out.println("16. Chuỗi sau khi thay thế ký tự 'o' bằng '0': " + replacedStr);

        boolean matchesRegex = str.matches(".*World.*");
        if (matchesRegex) {
            System.out.println("17. Chuỗi khớp với biểu thức chính quy '.*World.*'");
        } else {
            System.out.println("17. Chuỗi không khớp với biểu thức chính quy '.*World.*'");
        }
    }
}
