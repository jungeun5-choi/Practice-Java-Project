public class MainMenu {

    protected String name;
    protected String explain;

    MainMenu(){ }
    MainMenu(String name, String explain) {
        setter(name, explain);
    }

    public void setter(String name, String explain) {
        this.name = name;
        this.explain = explain;
    }

    // getter
    public String getName(){
        return name;
    }
    public String getExplain() {
        return explain;
    }
}
