public class Client {
    public static void main(String[] args) {
        Database database = new Adapter();

        database.insert();
        database.update();
        database.select();
        database.remove();
        database.search("id=101");
        database.clear();
    }
}