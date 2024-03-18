package EsnekBaglantı;

public class Test {
    public static void main(String[] args) {
        Araba araba1 = new Araba("Mercedes", "CLA180", 1199, "Kırmızı");
        Araba araba2 = new Araba("Sahin", "Tofas", 1989, "Beyaz");
        Araba araba3 = new Araba("Hacı Murat", "bilmiyorum", 2580, "Sari");
        ArabaIslemleriImp arabaIslemleriImp = new ArabaIslemleriImp();
        arabaIslemleriImp.arabakaydet (araba3);
        arabaIslemleriImp.arabakaydet(araba2);
        arabaIslemleriImp.arabakaydet (araba1);
        arabaIslemleriImp.arabalistele();

        // yeni implementasyonumuzu (arabaimp2) kullanmak istersek onada bir yer ayırmalıyız

        ArabaIslemleriImp2 arabaIslemleriImp2=new ArabaIslemleriImp2();
        arabaIslemleriImp2.arabakaydet (araba3);
        arabaIslemleriImp2.arabakaydet(araba2);
        arabaIslemleriImp2.arabakaydet (araba1);
        arabaIslemleriImp2.arabalistele();
        // NOT:
        // bu şekilde tek tek imp2 yapmamız gerekecek bunun kısayolu ise nesne tanımlarken *sol* tarafta
        //**interface** kullanmak sag tarafta istedigimiz implementasyonu kullanmak

        ArabaIslemleri arabaIslemleri= new ArabaIslemleriImp2();// ilk ArabaIslemleriImp di sonra 2 yaptık
        // bu şekilde tanımlarsan sonradan yeni imp eklediginde sadece sag taraftaki imp degiştirmen yeterli olacaktır
        // interface in asıl amacı da budur
        arabaIslemleri.arabakaydet (araba3);
        arabaIslemleri.arabakaydet(araba2);
        arabaIslemleri.arabakaydet (araba1);
        arabaIslemleri.arabalistele();
    }
}
