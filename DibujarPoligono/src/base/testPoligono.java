package base;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class testPoligono {
	
	@Test
	void ladosLongitudIgual() {
		Poligono poligono = new Poligono(null);
		poligono.setLongitudLado(10);
		poligono.getLados();
		poligono.setLados(5);
		poligono.calcularPerimetro();
		poligono.setPerimetro(60);
		poligono.getDibujo();
		poligono.setDibujo(null);
		
		assertEquals(poligono.getLongitudLado(),poligono.getPerimetro());
	}
	
	@Test
	void ladosLongitudMenos() {
		Poligono poligono1 = new Poligono(null);
		poligono1.setLongitudLado(10);
		poligono1.getLados();
		poligono1.setLados(5);
		poligono1.calcularPerimetro();
		poligono1.setPerimetro(60);
		poligono1.getDibujo();
		poligono1.setDibujo(null);
		
		assertEquals(poligono1.getLongitudLado(),poligono1.getPerimetro());
	}
	
	@Test
	void ladosLongitudMas() {
		Poligono poligono2 = new Poligono(null);
		poligono2.setLongitudLado(10);
		poligono2.getLados();
		poligono2.setLados(5);
		poligono2.calcularPerimetro();
		poligono2.setPerimetro(60);
		poligono2.getDibujo();
		poligono2.setDibujo(null);
		
		assertEquals(poligono2.getLongitudLado(),poligono2.getPerimetro());
	}
	
	
}
