package homework.l10.instrument;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument drum = new Drum(9);
        Instrument guitar = new Guitar(17);
        Instrument tube = new Tube(4);

        Instrument[] instruments = {drum, guitar, tube};
        for (Instrument instruments1 : instruments) {
            instruments1.play();
        }
    }
}
