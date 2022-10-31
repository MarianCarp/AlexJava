public class TeenNumberChecker {

    public static boolean isTeen (int parameter){
        return (parameter>=13&&parameter<=19);
    }
    public static boolean hasTeen (int x, int y, int z){
        return  (isTeen(x)||isTeen(y)||isTeen(z));
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(16,14,23));

    }
}
