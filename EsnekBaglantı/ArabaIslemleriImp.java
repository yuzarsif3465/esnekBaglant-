package EsnekBaglantı;

public class ArabaIslemleriImp implements ArabaIslemleri{
    @Override
    public void arabaBilgiYazdir(Araba araba) {
        System.out.println(araba);
    }

    @Override
    public boolean arabakaydet(Araba araba) {
        // buradan arabalar icin oluşturulan listeye giderek burdaki arabayı ekledik
        boolean durum = arabalar.add(araba);
        return durum;
    }

    @Override
    public boolean arabasil(Araba araba) {
        // buradaki arabalar interfaceteki oluşturdugumuz arraylist
        boolean durum= arabalar.remove(araba);
        return durum;
    }

    @Override
    public void arabalistele() {
        for (Araba araba : arabalar){
            System.out.println(araba);
        }
    }
}
