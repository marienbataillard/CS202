package this;

public class Pichu extends Pokemon {
    //subclasses inherit fields, methods but not constructors.

    public Pichu(String n) {
        //subclass Pichu sets hp without having to add it in the Main class which means putting less code in the main program
        super(n, 17);
        setImage(pichu.png)
    }

    public Pich(String n, int h) {
        super(n,h);
    }

    @Overide
    public void talk() {
        super.talk();
        IO.println("I am cute, but I can electrocute you.");

    }
}
