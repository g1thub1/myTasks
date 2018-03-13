package homework.l10.instrument;

import java.util.Objects;

public class Tube implements Instrument {
    private int diametr;

    public Tube(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public void play() {
        System.out.println("Играет " + KEY + " c такими то характеристиками " + diametr);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tube tube = (Tube) o;
        return diametr == tube.diametr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diametr);
    }

    @Override
    public String toString() {
        return "Tube{" +
                "diametr=" + diametr +
                '}';
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }
}
