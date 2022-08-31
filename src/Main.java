public class Main {
    public static void main(String[] args) {


        //HW 1

        int B = 190;
        int C = 20;
        int A = 1;
        int result = A;

        if (B > result)
            result = B;
        else if (C > result)
            result = C;

        System.out.println(result);
        
        //HW 2

        int x = 5, y = -7, result = 0, M = 1;

        if (y < 0) {
            y = -y;
            M = -1;
        } else
            M = 1;

        while (y > 0) {
            if (y % 2 == 0) {
                x = x + x;
                y = y / 2;
            } else {
                result = result + x;
                y = y - 1;
            }
        }
        if (M < 0)
            result = -result;

        System.out.println(result);

    }
}