package entities;

import javax.persistence.*;

import enums.PokemonColor;

@Entity
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String type;

	@Column(nullable = false)
	private int power;

	@Enumerated(EnumType.STRING)
	@Column(name = "color", nullable = false)
	private PokemonColor color;

	public Pokemon() {
		super();
	}

	public Pokemon(String name, String type, int power, PokemonColor color) {
		super();
		this.name = name;
		this.type = type;
		this.power = power;
		this.color = color;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public PokemonColor getColor() {
		return color;
	}

	public void setColor(PokemonColor color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", name=" + name + ", type=" + type + ", power=" + power + ", color=" + color
				+ "]";
	}

}
