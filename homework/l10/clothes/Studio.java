package homework.l10.clothes;

public class Studio {
    public void clotheAMan(Clothes[] clothes) {
        System.out.println("Мужские вещи: ");
        for (Clothes i : clothes) {
            if (i instanceof MensClothing) {
                System.out.println(i.getName() + " - Размер: " + i.getSize() +
                        ", Евро размер " + i.getSize().getEuroSize() +
                        ", Цена: " + i.getPrice() + " грн , Цвет: " + i.getColor());
            }
        }
    }

    public void clotheAWoman(Clothes[] clothes) {
        System.out.println("Женские вещи: ");
        for (Clothes i : clothes) {
            if (i instanceof WomensClothing) {
                System.out.println(i.getName() + " - Размер: " + i.getSize() +
                        ", Евро размер: " + i.getSize().getEuroSize() +
                        ", Цена: " + i.getPrice() + " грн , Цвет: " + i.getColor());
            }
        }
    }
}
