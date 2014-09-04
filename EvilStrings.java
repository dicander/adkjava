public class EvilStrings {
    private static int MAX = 50000;
    public static void main(String[] args) {
        if(args.length>=1) {
            if(args[0].equals("s")) {
                String numbers = "";
                for (int i = 0; i < MAX; i++) {
                    numbers += i;
                }
                System.out.println(numbers + "from String");
            } else {
                StringBuilder numbers = new StringBuilder();
                for (int i = 0; i < MAX; i++) {
                    numbers.append(i);
                }
                System.out.println(numbers + "from StringBuilder");
            }
        }
    }
}
