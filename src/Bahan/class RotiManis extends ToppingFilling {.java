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