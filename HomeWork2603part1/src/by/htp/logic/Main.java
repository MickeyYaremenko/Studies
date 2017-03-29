package by.htp.logic;

import by.htp.entity.Moon;
import by.htp.entity.Planet;
import by.htp.entity.Star;
import by.htp.entity.StarSystem;

public class Main {

	public static void main(String[] args) {
		Star sun = new Star("Sun");
		Planet earth = new Planet("Earth");
		Planet mars = new Planet("Mars");
		Planet venus = new Planet("Venus");
		earth.setMoon(new Moon("Moon"));
		Planet[] planets = new Planet[]{earth, mars, venus};
		StarSystem sunSystem = new StarSystem(sun, planets);
		Planet uranus = new Planet("Uranus");
		sunSystem.addPlanet(uranus);
		System.out.println("Our star name: " + sunSystem.starName());
		System.out.println("Amount of planets in our system: " + sunSystem.planetsAmount());
	}
}
