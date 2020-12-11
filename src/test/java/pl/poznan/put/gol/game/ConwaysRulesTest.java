package pl.poznan.put.gol.game;

import static org.junit.Assert.*;

public class ConwaysRulesTest {

	private ConwaysRules rules;


        @org.junit.jupiter.api.BeforeEach
	public void setUp() {
		rules = new ConwaysRules();
	}

	@org.junit.jupiter.api.Test
	public void diesBecauseOfUnderpopulation() {
		assertFalse(rules.inNextGeneration(true, 1));
	}

	@org.junit.jupiter.api.Test
	public void staysAlive() {
		assertTrue(rules.inNextGeneration(true, 2));
		assertTrue(rules.inNextGeneration(true, 3));
	}

	@org.junit.jupiter.api.Test
	public void diesBecauseOfOverpopulation() {
		assertFalse(rules.inNextGeneration(true, 4));
	}

	@org.junit.jupiter.api.Test
	public void aCellIsBorn() {
		assertTrue(rules.inNextGeneration(false, 3));
	}
}
