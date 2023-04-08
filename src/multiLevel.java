class sq{
    void dj(){
        System.out.println("Dj saurabh sq");
    }
}
class rq extends sq{
    void tengul(){
        dj();
        System.out.println("Bukkit Tengul");
    }
}
class zq extends rq{
    void mix(){
        dj();
        tengul();
    }
}
public class multiLevel {
    public static void main(String[] args) {
        zq s=new zq();
        s.dj();
        s.tengul();
        s.mix();
    }

}
