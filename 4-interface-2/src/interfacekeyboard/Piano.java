package interfacekeyboard;

// piano is a keyboard ---- IS-A relationship
public class Piano implements Keyboard {

    @Override
    public void pressWhiteKey(int i) {
        System.out.println("soft hammer hits wire " + i);
    }

    @Override
    public void pressBlackKey(int i) {
        System.out.println("soft hammer hits wire " + i + ".5");
    }
}
