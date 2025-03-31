public abstract class Base {
    private int id;
    private String title;

    public Base() {}

    public Base(int id, String title){
        this.id = id;
        this.title = title;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public abstract void displayInfo();

    @Override
    public String toString() {
        return "Base{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
