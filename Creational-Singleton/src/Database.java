public class Database {
    private String data;
    private static Database instance;

    private Database(String data) {
        this.data = data;
    }
    public static Database getInstance(String data) {
        if(instance==null) {
            instance = new Database(data);
        }
        return instance;
    }
    public String toString() {
        return "Data: %s".formatted(data);
    }
}
