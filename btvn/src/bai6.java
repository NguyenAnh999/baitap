public class bai6 {
        public static void main(String[] args) {
            int gioHan=20;
            for (int i = 2; i != 0; i++) {
                for (int j = 2; j <= i; j++) {
                    if (i % j == 0) {
                        break;
                    }
                    if (gioHan>0) {
                        System.out.println(i);
                        gioHan--;
                        break;
                    }
                }
            }
        }
}
