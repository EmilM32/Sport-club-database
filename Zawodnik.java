package tangun;


public class Zawodnik {
    private int id;
    private String imie;
    private String nazwisko;
    private int ix;
    private int x;
    private int xi;
    private int xii;
    private int i;
    private int ii;
    private int iii;
    private int iv;
    private int v;
    private int vi;
    
    public Zawodnik(int id, String imie, String nazwisko, int ix, int x, int xi, int xii, int i, int ii, int iii, int iv, int v, int vi){
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ix = ix;
        this.x = x;
        this.xi = xi;
        this.xii = xii;
        this.i = i;
        this.ii = ii;
        this.iii = iii;
        this.iv = iv;
        this.v = v;
        this.vi = vi; 
    }
    
     public int getId() {
        return id;
    }
 
    public void setId(int nr) {
        this.id = id;
    }
     public String getName() {
        return imie;
    }
 
    public void setName(String imie) {
        this.imie = imie;
    }
     public String getSurname() {
        return nazwisko;
    }
 
    public void setSurname(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    
    public int getIX() {
        return ix;
    }
    public void setIX(int ix) {
        this.ix = ix;
    }
    
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    
    public int getXI() {
        return xi;
    }
    public void setXI(int xi) {
        this.xi = xi;
    }
    
    public int getXII() {
        return xii;
    }
    public void setXII(int xii) {
        this.xii = xii;
    }
    
    public int getI() {
        return i;
    }
    public void setI(int i) {
        this.i = i;
    }
    
    public int getII() {
        return ii;
    }
    public void setII(int ii) {
        this.ii = ii;
    }
    
    public int getIII() {
        return iii;
    }
    public void setIII(int iii) {
        this.iii = iii;
    }
    
    public int getIV() {
        return iv;
    }
    public void setIV(int iv) {
        this.iv = iv;
    }
    
    public int getV() {
        return v;
    }
    public void setV(int v) {
        this.v = v;
    }
    
    public int getVI() {
        return vi;
    }
    public void setVI(int vi) {
        this.vi = vi;
    }
    
}
