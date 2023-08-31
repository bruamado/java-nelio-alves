package teste;

public class Fruta {
	private String name;
	private String color;
	private Integer seedsQty;
	
	public Fruta() {
		
	}
	
	public Fruta(String name, String color, Integer seedsQty) {
		this.name = name;
		this.color = color;
		this.seedsQty = seedsQty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getSeedsQty() {
		return seedsQty;
	}

	public void setSeedsQty(Integer seedsQty) {
		this.seedsQty = seedsQty;
	}
}
