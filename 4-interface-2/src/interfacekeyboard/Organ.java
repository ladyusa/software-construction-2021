package interfacekeyboard;

// Organ is a keyboard ---- IS-A relationship
public class Organ implements Keyboard {

    public void pressWhiteKey(int i) {
        System.out.println("blow wind through pipe " + i);
    }

    public void pressBlackKey(int i) {
        System.out.println("blow wind through pipe " + i + ".5");
    }
}
