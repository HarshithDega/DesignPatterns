public class Database {
    private String data;
    private static volatile Database instance;

    private Database(String data) {
        this.data = data;
    }

    public static Database getInstance(String data) {
        Database result = instance;
        if (result == null) {
            synchronized (Database.class) {
                result = instance;
                if (result == null) {
                    instance = result = new Database(data);
                }
            }
        }
        return result;
    }

    public String toString() {
        return "Data: %s".formatted(data);
    }
}