public class Main {
    public static void main(String[] args) {

        CustomArrayList<String> list = new CustomArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(i,"String element: " + i);
        }

        list.remove(9);
        list.remove(7);
        list.remove(1);
        list.add("10");
        list.add("11");
        list.add("12");
        list.add("13");
        list.remove(7);
        System.out.println("Debug");


    }
}
