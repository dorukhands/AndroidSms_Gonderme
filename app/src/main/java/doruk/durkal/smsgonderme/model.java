package doruk.durkal.smsgonderme;

public class model {
    private String isim,tel;

    public model(String isim, String tel) {
        this.isim = isim;
        this.tel = tel;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
