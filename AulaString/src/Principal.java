
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "texto 01";
		String texto2 = new String("texto 02");
		
		// Acessar um caracter específico dentro do texto pelo índice
		System.out.println(texto.charAt(5));
		
		// Obter o tamanho (quantidade de chars) do texto
		System.out.println(texto.length());
		
		// Verificar se o texto é vazio
		System.out.println(texto == "");
		System.out.println("".length() == 0);
		System.out.println(texto.isEmpty());
		
		// Obter uma substring dentro do texto original definindo o ponto de partida e fim
		System.out.println(texto.substring(2));
		System.out.println(texto.substring(2, 4));
		
		// Concatenação de strings
		String nome = "Marcos";
		String sobrenome = "Santos";
		String nomeCompleto = nome + sobrenome;
		String nomeCompleto2 = nome.concat(sobrenome);
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(nomeCompleto);
		System.out.println(nomeCompleto2);
		
		//Imutabilidade
		// O tipo string em java é imutável
		nome = "Novo nome"; // Cria uma nova string e referencia na variável nome
		
		String string1 = "hello";
		String string2 = string1;
		
		string1 = "world";
		
		System.out.println(string1 + " " + string2);
		
		
		// uper case e lower case
		String nomeMaiusculo = "Marcos".toUpperCase();
		String nomeMinusculo = nomeMaiusculo.toLowerCase();
		
		System.out.println(nomeMaiusculo);
		System.out.println(nomeMinusculo);
		
		// Limpar o texto removendo espaços em branco do início e do final
		String textoSujo = " Marcos Antonio ";
		System.out.println(textoSujo);
		System.out.println(textoSujo.trim());
		
		
		// Dividir um texto em diversas palavras.
		String textoCompleto = "Marcos Antonio dos Santos, Lucas de Souza";
		String nomes[] = textoCompleto.split(" ");
		for(int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		String nomes2[] = textoCompleto.split("[ ,]");
		for(int i = 0; i < nomes2.length; i++) {
			System.out.println(nomes2[i]);
		}
		
		// começa com e termina com
		String nomeDaPessoa = "Lucas Amaral";
		System.out.println(nomeDaPessoa.startsWith("M"));
		System.out.println(nomeDaPessoa.startsWith("Lucas"));
		
		// estes métodos são case sensitive, portanto diferenciam minúsculas de maiúsculas
		System.out.println(nomeDaPessoa.endsWith("l"));
		System.out.println(nomeDaPessoa.endsWith("L"));
		
		// Comparar duas Strings
		String texto01 = "texto";
		String texto02 = "Texto";
		
		// Devolve 0 se são iguais ou um número inteiro diferente de 0 se for diferentes
		
		// Considera minúsculas e maiúsculas
		System.out.println(texto01.compareTo(texto02));
		// Não considera minúsculas e maiúsculas
		System.out.println(texto01.compareToIgnoreCase(texto02));
		
		// Troca de uma string por outra dentro do texto
		String outroTexto = "Texto qualquer com outro Texto";
		
		String novoTexto = outroTexto.replace("Texto", "Palavra");
		String textoReplaceAll = outroTexto.replaceAll("[a-c]", "-");
		
		System.out.println(novoTexto);
		System.out.println(textoReplaceAll);
		
		
		//Pesquisar o índice que está uma sequência de caracteres dentro do texto.
		String text = "novo texto";
		System.out.println(text.indexOf("texto"));
		
		
		
		
		// Separar um texto em um array de palavras - OK
		// Colocar a primeira letra de cada palavra maiúscula - OK
		// Juntos todas as palavras novamente separando por espaço - OK
		
		String textoQualquer = "um texto com algumas palavras";
		String[] vetorDePalavras = textoQualquer.split(" ");
		
		for(int i=0; i<vetorDePalavras.length; i++) {
			String primeiraLetra = String.valueOf(vetorDePalavras[i].charAt(0));
			
			String palavraSemPrimeiraLetra = vetorDePalavras[i].substring(1);
			
			String palavraFinal = primeiraLetra.toUpperCase() + palavraSemPrimeiraLetra;
			
			vetorDePalavras[i] = palavraFinal;
		}
		
		String textoModificado = String.join(" ", vetorDePalavras);
		System.out.println(textoModificado);
	}

}
