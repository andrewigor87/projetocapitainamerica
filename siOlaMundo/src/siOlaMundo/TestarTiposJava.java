package siOlaMundo;

import javax.swing.JOptionPane;

public class TestarTiposJava {

	public static void main(String[] args) {
		// Camelcase

		// Tipos Primitivos
		int Inteiro; // 1, 2, 3, 10 
		String palavra; // Escrever  uma frase
		boolean VerdadeiroOuFalso; // true ou false
		double numeroReal; // 10, 5
		int rubensIdade = 0;
		// Idade do Rubens, se maior de 18 anos Entra senão Não Entra

		// se (Condição) for verdadeira {
		//aqui 12
		// }else {
		// o que está aqui 15
		//}
		rubensIdade = Integer.parseInt((JOptionPane.showInputDialog("Digite sua Idade")));

		if(rubensIdade > 18) {
			System.out.println("O rubens é maior de 18 anos - " + rubensIdade + " Anos, pode entrar...");
		}else {
			System.out.println("O rubens é menor de " + rubensIdade + " Anos, não pode entrar...");
		}






	}

}
