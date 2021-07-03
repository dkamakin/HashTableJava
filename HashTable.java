public class HashTable<T> {
    private final HashVector<HashList<T>> table;
    int size;

    HashTable(int size) {
        this.size = size;
        this.table = new HashVector<>(size);
    }

    public void add(T elem) {
        table.get((int)hash(elem)).pushBack(elem);
    }

    public int count(T value) {
        return table.get((int)hash(value)).count(value);
    }

    public void output() {
        for (int i = 0; i < size; i++) {
            System.out.print("Table[" + i + "]: ");

            for (int j = 0; j < table.get(i).getSize(); j++) {
                System.out.print(table.get(i).get(j).getData() + "->");
            }

            System.out.println();
        }
    }

    private long hash(T value) {
        System.out.println("Calculating hash for (" + value.toString() + "): ");
        long hash = 0;

        for (int i = 0; i < value.toString().length(); i++) {
            long number = value.toString().charAt(i);
            System.out.print("Hash = 37 * " + hash + " + " + number + " = ");
            hash = 37 * hash + number;
            System.out.println(hash);
        }

        System.out.print("Correcting hash: " + hash + " % " + size + " = ");
        hash %= size;
        System.out.println(hash);
        return hash;
    }

}
