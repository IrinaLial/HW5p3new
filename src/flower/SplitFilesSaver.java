package flower;

public class SplitFilesSaver {
    public static void main(String[] args) {
        FlowerStore store = new FlowerStore();
        store.flowers.add(new Rose ("Roza", 10));
        store.flowers.add(new Chamomile ("Romashka", 111));
        store.flowers.add(new Tulip("Tiulpan", 15));


        store.save("src/files/store_save.txt");
        store.load("src/files/store_save.txt");

        System.out.println(store);
    }
}
