package ma.projet;

public class TestTriplet {
  public static void main(String[] args) {
	Triplet<Integer> intT = new Triplet<Integer>(4, 7, 9);
	intT.affiche();
	Triplet<String> strT = new Triplet<String>("younesse", "ait", "mhand");
	strT.affiche();
	 System.out.println("Second élément de intT : " + intT.getSec());
}
}
