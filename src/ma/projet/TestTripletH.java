package ma.projet;

public class TestTripletH {
  public static void main(String[] args) {
	TripletH<Integer, Double, String> The = new TripletH<Integer, Double, String>(5, 5.0, "younesse");
	The.affiche();
	TripletH<String, Double, Boolean> The2 = new TripletH<String, Double, Boolean>("younesse", 1.0, false);
	The2.affiche();
	System.out.println("Troisieme élément de The : "+ The.getTro());
}
}
