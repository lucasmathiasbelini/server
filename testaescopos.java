package pacote;

public class testaescopos {

	public static void main(String[] args) {
		
		
		byte numeros_de_pessoas = 22;
		boolean verdade = numeros_de_pessoas == 22;
		System.out.println("O serivdor está cheio? " + verdade);

		boolean server_ligado = true;
		boolean server_off = false;
		if (server_ligado == true && server_off == false) {
			char interrogaçao = 63;
			char sim = 10004;
			System.out.println("Servidor disponivel " + sim);
			String login = "Email:";
			login = login + "........" + interrogaçao;
			System.out.println(login);
			String senha = "Senha:";
			senha = senha + "........" + interrogaçao;
			System.out.println(senha);
		} else {
			char nao = 10006;
			System.out.println("Fora do ar" + " :/");
		}
		System.out.println("numero de acessos");
		int numeros_de_acesso = 001;
		while (numeros_de_acesso <= 120) {
			System.out.println(numeros_de_acesso);
			numeros_de_acesso = numeros_de_acesso += 1;
			char sim = 10004;
			String slc = "Aprovado" + sim;
			System.out.println(slc);
		}
	}
}
