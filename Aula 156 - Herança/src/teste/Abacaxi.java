package teste;

public class Abacaxi extends Fruta{
	private Integer id;

	public Abacaxi() {
		
	}
	
	public Abacaxi(Integer id) {
		super();
		this.id = id;
	}

	public Abacaxi(String name, String color, Integer seedsQty, Integer id) {
		super(name, color, seedsQty);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
