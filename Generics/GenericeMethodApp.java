public class GenericeMethodApp {
    public static void main(String[] args) {
        Integer[] ages = {22, 32, 12, 52, 34, 41};
        String[] cities = {"Mosco", "Tokyo", "Jaipur", "Udaipur", "Bikaner"};
        GenericeMethodApp.<Integer>print(ages);
        GenericeMethodApp.<String>print(cities);
    }

    public static <E> void print(E[] arr) {
        for(E item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
