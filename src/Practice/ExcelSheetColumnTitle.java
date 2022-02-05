package Practice;

public class ExcelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
        if(columnNumber<=26) {
            char c = (char) (64 + columnNumber);
            sb.append(c);
            break;
        }
        else {
            int letter = columnNumber%26;
            columnNumber /= 26; //54
            if(letter == 0)
            {
                sb.append("Z");
                columnNumber--;
            }
            else
            sb.append((char)(letter + 64));
        }
        }
            return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int n = 1221;
        System.out.println(convertToTitle(n));
    }
}
