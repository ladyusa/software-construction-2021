package interfacekeyboard;

// pianist is a keyboard ---- ไม่ใช่ IS-A relationship
public class Pianist {

    // HAS-A relationship
    //   pianist has a keyboard
    //   instance variable ที่เป็น object type
    private Keyboard keyboard;

    // attribute --- instance variables ที่เป็น primitive type + String + Date
    private String name;
    private String role;

    public Pianist(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void playMusic() {
        keyboard.pressWhiteKey(1);
        keyboard.pressWhiteKey(2);
        keyboard.pressWhiteKey(3);
    }
}
