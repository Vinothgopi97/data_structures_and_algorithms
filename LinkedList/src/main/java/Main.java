public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ListImpl<>();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(20);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(10);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(20);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(30);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        list.remove(40);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());

    }
}
