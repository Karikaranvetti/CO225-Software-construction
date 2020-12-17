public class Shapes {
    private final String colour;
    public Shapes(final String colour) {    // constuctor 
        this.colour = colour; 
        }
    public void show() {
        System.out.println(get_colour()+ " " +get_type() + " which has area of " + get_area());
    }
    public String get_colour() { return this.colour; }
/* not the best way. Interface is better */
    public String get_type() { return "Unknown"; }
    public float get_area() { return 0f; }

}

