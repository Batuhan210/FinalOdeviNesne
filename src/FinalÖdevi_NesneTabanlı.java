public class FinalÖdevi_NesneTabanlı {

    public FinalÖdevi_NesneTabanlı() { /* compiled code */ }

    public static void main(java.lang.String[] args) { /* compiled code */ }
}


public class Insan {
    java.lang.String ad;
    java.lang.String soyad;
    int dogumyili;
    int yas;
    int yil;

    Insan() { /* compiled code */ }

    Insan(java.lang.String ad, java.lang.String soyad, int dogumyili) { /* compiled code */ }

    private int tarihHesapla(int baslamaYili) { /* compiled code */ }

    public int yashesapla(int dogumyili) {


    }

}

public class Doktor extends Insan {
    java.lang.String dokAlani;
    java.lang.String uzmAlani;
    int ameliyatSayisi;
    int baslamaYili;
    int tecrube;
    float maas;

    Doktor() { /* compiled code */ }

    Doktor(java.lang.String ad, java.lang.String soyad, int dogumyili, java.lang.String dokAlani, java.lang.String uzmAlani, int ameliyatSayisi, int baslamaYili, float maas, int zamMiktarı, float zamOrani) { /* compiled code */ }

    void Bilgi() { /* compiled code */ }

    void Zam(int zamMiktari) {}

    void Zam(float zamOrani) {}

    public int tarihHesapla(int baslamaYili) {



    }



    }


public class Muhendis extends Insan {
    java.lang.String muhAlan;
    java.lang.String uzmAlani;
    int baslamaYili;
    int tecrube;
    float maas;
    int yil;

    Muhendis() { /* compiled code */ }

    Muhendis(java.lang.String ad, java.lang.String soyad, int dogumyili, java.lang.String muhAlan, java.lang.String uzmAlani, int baslamaYili, float maas, int zamMiktarı, float zamOrani) { /* compiled code */ }

    void Bilgi() { /* compiled code */ }

    void Zam(int zamMiktari) { /* compiled code */ }

    void Zam(float zamOrani) { /* compiled code */ }

    public int tarihHesapla(int baslamaYili) { /* compiled code */ }

}


public class Ogretmen extends Insan {
    java.lang.String brans;
    int baslamaYili;
    int tecrube;
    int dersSaati;
    float maas;
    int yil;

    Ogretmen() { /* compiled code */ }

    Ogretmen(java.lang.String ad, java.lang.String soyad, int dogumyili, java.lang.String brans, int baslamaYili, int dersSaati, float maas, int zamMiktarı, float zamOrani) { /* compiled code */ }

    void Bilgi() { /* compiled code */ }

    void Zam(int zamMiktari) { /* compiled code */ }

    void Zam(float zamOrani) { /* compiled code */ }

    public int tarihHesapla(int baslamaYili) { /* compiled code */ }

}





























