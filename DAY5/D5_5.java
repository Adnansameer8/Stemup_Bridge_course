public class D5_5 {
    static String[] names = new String[10];
    static int[] ids = new int[10];
    static int count = 0;

    public static void addCustomer(String name, int id) {
        names[count] = name;
        ids[count] = id;
        count++;
    }

    public static void showCustomers() {
        for (int i = 0; i < count; i++) {
            System.out.println(ids[i] + " - " + names[i]);
        }
    }

    public static void main(String[] args) {
        addCustomer("Alice", 1);
        addCustomer("Bob", 2);
        showCustomers();
    }
}
