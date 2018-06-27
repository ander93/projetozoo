package main;

import Model.Animal;
import Model.CorpoHumano;

public class TesteinnerClass {
	public static void main(String[] args) {
		Animal animal = new Animal();

		Animal.Coracao coracao = animal.new Coracao();
		coracao.bater();

		Animal.Cerebro cerebro = animal.new Cerebro();
		cerebro.pensarEm("Viajar");
		
		CorpoHumano corpoHumano = new CorpoHumano();
		corpoHumano.existir();
	}

}
