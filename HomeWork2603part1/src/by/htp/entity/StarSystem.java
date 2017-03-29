package by.htp.entity;

import java.util.Arrays;

public class StarSystem {
	private Star star;
	private Planet[] planets;

	public StarSystem(Star star, Planet[] planets) {
		this.star = star;
		this.planets = planets;
	}

	public Star getStar() {
		return star;
	}

	public void setStar(Star star) {
		this.star = star;
	}

	public Planet[] getPlanets() {
		return planets;
	}

	public void setPlanets(Planet[] planets) {
		this.planets = planets;
	}

	public int planetsAmount() {
		return this.planets.length;
	}

	public String starName() {
		return this.star.getName();
	}

	public void addPlanet(Planet planet) {
		planets = Arrays.copyOf(planets, planets.length + 1);
		planets[planets.length - 1] = planet;
	}

}
