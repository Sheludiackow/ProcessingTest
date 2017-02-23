
import processing.core.PApplet;

public class MainClass extends PApplet {
    public static void main (String... args) {
        MainClass pt = new MainClass();
        PApplet.runSketch(new String[]{"ProcessingTest"}, pt);
    }
    @Override
    public void settings() {
        size(600, 400);
    }
    public void setup() {
        background(0);
    }
    @Override
    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX,mouseY,pmouseX,pmouseY);
        }
    }
}