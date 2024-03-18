package EsnekBaglantı;

import java.util.ArrayList;
// bu kısımda sadece static ve finaller ile degeri belli olan degiskenler bulunabilir
public interface ArabaIslemleri {
    public ArrayList<Araba> arabalar = new ArrayList<>();
    public void arabaBilgiYazdir(Araba araba);
    public boolean arabakaydet (Araba araba);
    public boolean arabasil(Araba araba);
    public void arabalistele();
}
