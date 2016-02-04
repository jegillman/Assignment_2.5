public class Main {

    public static void main(String[] args) {

        
    }

    public static int Ninety_Nine_Bottles_of_Beer(int count) {
        if (count > 2) {
            System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer,\n" +
                    "take one down, pass it around, " + (count - 1) + " bottles of beer on the wall");
            return Ninety_Nine_Bottles_of_Beer(count - 1);
        }
        System.out.println(count + " bottles of beer on the wall, " + count + " bottles of beer,\n" +
                "take one down, pass it around, " + (count - 1) + " bottle of beer on the wall.\n" +
                (count - 1) + " bottle of beer on the wall, " + (count - 1) + " bottle of beer,\n" +
                "take one down, pass it around, no more bottles of beer on the wall.");
        return 0;
    }
}
