package EsnekBaglantı;
// esnek baglantının amacı var olanın dışında yeni bir imp tanımlayarak guncellemektir
// yani eskiye karışmadan yeni metotlar vb ekleyerek yapılır (daha iyi bir hale getirmek için)
public class ArabaIslemleriImp2 implements ArabaIslemleri {

    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println("Marka : "+ araba.getMarka());
        System.out.println("Model : "+ araba.getModel());
        System.out.println("Uretim Yili : " + araba.getUretimYili());
        System.out.println("Renk : " + araba.getRenk());

    }

    @Override
    public boolean arabakaydet(Araba araba) {
        System.out.println("Kaydedilen Araba : ");
        arabaBilgiYazdir(araba);
        boolean durum = arabalar.add(araba);
        return durum;
    }

    @Override
    public boolean arabasil(Araba araba) {
        System.out.println("Silinen Araba : " );
        arabaBilgiYazdir(araba);
        boolean durum = arabalar.remove(araba);
        return durum;
    }

    @Override
    public void arabalistele() {
        for (Araba araba : arabalar) {
            System.out.println("-----");
            arabaBilgiYazdir(araba);
            System.out.println("----- ");
        }

    }
}
