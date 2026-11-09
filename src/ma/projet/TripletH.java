package ma.projet;

public class TripletH<A,B,C> {
	private final A pre;
    private final B sec;
    private final C tro;
	public TripletH(A pre, B sec, C tro) {
		super();
		this.pre = pre;
		this.sec = sec;
		this.tro = tro;
	}
	public A getPre() {
		return pre;
	}
	public B getSec() {
		return sec;
	}
	public C getTro() {
		return tro;
	}
	public void affiche() {
        System.out.println("TripletH : ["
            + pre + ", "
            + sec  + ", "
            + tro + "]");
    }
    
}
