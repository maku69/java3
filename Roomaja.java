package hajr10;

public class Roomaja extends Loom {
    private boolean onSoomustega;

    public Roomaja(boolean onSoomustega) {
        this.onSoomustega = onSoomustega;
    }

    public boolean isOnSoomustega() {
        return onSoomustega;
    }

    @Override
    public void toit() {
        System.out.println("Söön putukaid ja väikseid närilisi.");
    }
}
