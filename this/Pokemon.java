package this;


public class Pokemon {
    //fields
    private int hp;
    private String name;
    private String type;
    private ImageIcon picture;
    private Rectangle bounds;



    //Method
    public Pokemon battle(Pokemon opponent) {
        if (this.hp > opponent.hp) {
            return this;
        } else {
            return opponent;
        }
    }
    public void draw 


}
