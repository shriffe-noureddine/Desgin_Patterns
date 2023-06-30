
// Client code
public class Main {
    public static void main(String[] args) {
        // receiver
        Light light = new Light();

        // command
        Command turnOn = new TurnOnLightCommand(light);

        // invoker
        RemoteControl control = new RemoteControl(turnOn);
//        control.setCommand(turnOn);
        control.pressButton();
    }
}