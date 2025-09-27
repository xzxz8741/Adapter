public interface Database {
    public void insert();

    public void update();

    public void select();

    public void remove();
    default void search(String query) {
        System.out.println("Searching in database for: " + query);
    }

    default void clear() {
        System.out.println("Clearing all records from database...");
    }
}
