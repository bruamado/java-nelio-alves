package teste;

public class Melancia extends Fruta{
	private Integer id;

	public Melancia() {
		
	}
	
	public Melancia(Integer id) {
		super();
		this.id = id;
	}

	public Melancia(String name, String color, Integer seedsQty, Integer id) {
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
