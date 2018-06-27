package interfaces;

import model.Garrafa;

public interface Retornavel {
	
	public static final String FABRICANTE = "Coca-Cola";
	
	public abstract void jogarFora();
	public abstract Garrafa retornar();
	
}
