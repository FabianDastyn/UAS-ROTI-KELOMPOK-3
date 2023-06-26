class RotiManis extends ToppingFilling {
    private int kebutuhanAdonan; // kebutuhan adonan 1 kali pesanan
    private int adonan;
    private int pesanan;

    // set kebutuhan adonan sekali pesanan dan sisa adonan
    RotiManis(int pesanan) {
        this.kebutuhanAdonan = 50 * pesanan; // kebutuhan adonan tiap roti
        this.pesanan = pesanan;
    }

    public void tambahAdonan() {
        while (kebutuhanAdonan > adonan) {
            super.setTambahAdonan(1000, 150, 150, 20, 300, 250, 80, 400);
            adonan = super.getBeratBahan();
        }
    }

    public int getModal(){
        return super.getHargaBahan() + super.getHargaTopping();
    }

    public void info() {
        System.out.printf("| %-19s | %-20s |\n", "Jumlah pesanan", pesanan);
        System.out.printf("| %-19s | %-20s |\n", "Harga all bahan", super.getHargaBahan());
        System.out.printf("| %-19s | %-20s |\n", "Harga all topping", super.getHargaTopping());
        System.out.printf("| %-19s | %-20s |\n", "Jumlah adonan", super.getBeratBahan());
        System.out.printf("| %-19s | %-20s |\n", "Kebutuhan adonan", kebutuhanAdonan);
        System.out.printf("| %-19s | %-20s |\n", "Harga modal /roti", getModal() / pesanan);
        System.out.printf("| %-19s | %-20s |\n", "Harga jual /roti",
                String.format("%.2f", (getModal() / pesanan) * 1.4));
        System.out.println("+---------------------+----------------------+");
        System.out.println("");
    }
}
class RotiManisVarian1 extends RotiManis {
    RotiManisVarian1(int pesanan) {
        super(pesanan);
        super.setHargaKeju(5, pesanan);
        super.setHargaCoklat(5, pesanan);
        super.setHargaCoklat(5, pesanan);
    }

    @Override
    public void info() {
        System.out.println("+---------------------+----------------------+");
        System.out.printf("| %-19s | %-20s |\n", "Jenis Roti", "Roti manis varian 1");
        System.out.printf("| %-19s | %-20s |\n", "Filling & topping", "Keju, coklat, coklat");
        super.info();
    }   
}

class RotiManisVarian2 extends RotiManis {
    RotiManisVarian2(int pesanan) {
        super(pesanan);
        super.setHargaRedBean(10, pesanan);
        super.setHargaVanilla(5, pesanan);
    }

    @Override
    public void info() {
        System.out.println("+---------------------+----------------------+");
        System.out.printf("| %-19s | %-20s |\n", "Jenis Roti", "Roti manis varian 2");
        System.out.printf("| %-19s | %-20s |\n", "Filling & topping", "Red bean, vanilla");
        super.info();
    }
}

class RotiManisVarian3 extends RotiManis {
    RotiManisVarian3(int pesanan) {
        super(pesanan);
        super.setHargaKeju(10, pesanan);
        super.setHargaSosis(10, pesanan);
    }

    @Override
    public void info() {
        System.out.println("+---------------------+----------------------+");
        System.out.printf("| %-19s | %-20s |\n", "Jenis Roti", "Roti manis varian 3");
        System.out.printf("| %-19s | %-20s |\n", "Filling & topping", "Keju, sosis");
        super.info();
    }
}
