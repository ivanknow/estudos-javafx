package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class VitrineController {
	private static List<Produto> produtos = new ArrayList<Produto>();

	public void addProdutos(Produto... ps) {
		for (Produto p : ps)
			produtos.add(p);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
