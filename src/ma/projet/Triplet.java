package ma.projet;

public class Triplet<T> {
	private final T pre;
    private final T sec;
    private final T tro;
    
    public Triplet(T pre, T sec, T tro) {
		super();
		this.pre = pre;
		this.sec = sec;
		this.tro = tro;
	}
   
	public T getPre() {
		return pre;
	}

	public T getSec() {
		return sec;
	}

	public T getTro() {
		return tro;
	}

	/** Affiche les trois éléments */
    public void affiche() {
        System.out.println("Triplet : ["
            + pre + ", "
            + sec+ ", "
            + tro + "]");
    }
}
