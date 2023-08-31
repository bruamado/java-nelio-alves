package teste;

public class Morango extends Fruta{
	private Integer id;

	public Morango() {
		
	}
	
	public Morango(Integer id) {
		super();
		this.id = id;
	}

	public Morango(String name, String color, Integer seedsQty, Integer id) {
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
