import java.util.Scanner;

public class TVRemoteControl {
    private static boolean isTVOn = false;
    private static int volume = 1;
    private static int channel = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TV Remote Control Simulator");
        System.out.println("Available Buttons: 0-9, ON/OFF, VOL+, VOL-, CH+, CH-, EXIT");

        while (true) {
            System.out.print("Press a button: ");
            String button = scanner.next();

            if (button.equalsIgnoreCase("ON/OFF")) {
                togglePower();
            } else if (!isTVOn) {
                System.out.println("TV is off. Please turn it on first.");
            } else {
                switch (button) {
                    case "VOL+":
                        changeVolume(true);
                        break;
                    case "VOL-":
                        changeVolume(false);
                        break;
                    case "CH+":
                        changeChannel(true);
                        break;
                    case "CH-":
                        changeChannel(false);
                        break;
                    case "EXIT":
                        System.out.println("Turning off the TV and exiting the program.");
                        isTVOn = false;
                        break;
                    default:
                        if (button.matches("[0-9]")) {
                            System.out.println("Button " + button + " pressed.");
                        } else {
                            System.out.println("Invalid button.");
                        }
                        break;
                }
            }

            if (!isTVOn && button.equalsIgnoreCase("EXIT")) {
                break;
            }
        }

        scanner.close();
        System.out.println("TV Remote Control Simulator ended.");
    }

    private static void togglePower() {
        isTVOn = !isTVOn;
        System.out.println("TV turned " + (isTVOn ? "on" : "off") + ".");
    }

    private static void changeVolume(boolean increase) {
        if (increase && volume < 15) {
            volume++;
        } else if (!increase && volume > 1) {
            volume--;
        }
        System.out.println("Volume: " + volume);
    }

    private static void changeChannel(boolean next) {
        if (next) {
            channel = channel == 9 ? 1 : channel + 1;
        } else {
            channel = channel == 1 ? 9 : channel - 1;
        }
        System.out.println("Channel: " + channel);
    }
}
