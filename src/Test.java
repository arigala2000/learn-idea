import java.util.ArrayList;
import java.util.List;

public class Test {

    private int age;

    private static final int fff = 1;

    public static void main(String[] args) {
        //region Description
        System.out.println("Hello World");
        // 注释
        List list = new ArrayList(12);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //endregion

        System.out.println(list);

        if (list != null) {

        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        if (list != null) {
            System.out.println(list);
        }

        for (Object o : list) {
            System.out.println(o);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test();

    }

    public static void test() {
        ArrayList arrayList = new ArrayList(12);
    }

}
