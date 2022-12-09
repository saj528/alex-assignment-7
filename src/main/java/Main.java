public class Main {
    public static void main(String[] args) {

        CustomArrayList<String> list = new CustomArrayList();

        for (int i = 0; i <= 20; i++) {
            list.add(0,"String element: " + i);
        }


        System.out.println("Debug");


    }
}
