package term2.daos.lesson17;

public class Bageri {

	public static void main(String args[]) {
        System.out.println( "Starter Ekspedient og Kunde tr�dene" );
        TagEtNummer nummerDims = new TagEtNummer();
        Ekspedient ekspedient = new Ekspedient(nummerDims);
        ekspedient.start();
        for (int k = 0; k < 10; k++) {
            Kunder kunder = new Kunder(nummerDims);
            kunder.start();
        }
    }
}
