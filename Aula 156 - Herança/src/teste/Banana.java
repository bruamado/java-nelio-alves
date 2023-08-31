package teste;

public class Banana extends Fruta{
	private Integer id;

	public Banana() {
		
	}
	public Banana(Integer id) {
		super();
		this.id = id;
	}

	public Banana(String name, String color, Integer seedsQty, Integer id) {
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
