package hajr10;

public class app {
    public static void main(String[] args) {

        Roomaja madu = new Roomaja(true);
        Lind tuvi = new Lind(true);
        Kala lõhe = new Kala(true);

        madu.toit();
        System.out.println("Madu on soomustega: " + madu.isOnSoomustega());

        tuvi.toit();

        lõhe.toit();

    }
}
