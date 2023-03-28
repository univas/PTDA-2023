import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		exercicio9();
	}
	
	public static void exercicio1() {
		String textoLido = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o texto desejado:");
		textoLido = scanner.nextLine();
		while(textoLido.length() > 40 || textoLido.isEmpty()) {
			System.out.printf("Voce digitou uma palavra com %d caracteres.\n", textoLido.length());
			System.out.println("Voce deve informar um texto que tenha entre 1 e 40 caracteres.");
			System.out.println("Digite novamente:");
			
			textoLido = scanner.nextLine();
		}
		
		while(textoLido.length() < 40) {
			textoLido = "_".concat(textoLido);
		}
		
		System.out.println(textoLido);
		
		scanner.close();
	}

	public static void exercicio2() {
		String data = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a data desejada:");
		data = scanner.nextLine();
		
		if(data.matches("\\d{2}\\/\\d{2}\\/\\d{4}")) {
			String[] partes = data.split("/");
			
			String[] dias = {"um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
							 "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove", "vinte",
							 "vinte e um", "vinte e dois", "vinte e três", "vinte e quatro", "vinte e cinco", "vinte e seis", "vinte e sete", "vinte e oito", "vinte e nove", "trinta", "trinta e um"};
			
			String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
			
			String dataExtenso = dias[Integer.parseInt(partes[0]) - 1];
			dataExtenso += " de ";
			dataExtenso += meses[Integer.parseInt(partes[1]) - 1];
			dataExtenso += " de ";
			dataExtenso += partes[2];
			
			System.out.println(dataExtenso);
		}else {
			System.out.println("A data nao esta em formato valido.");
		}
		
		scanner.close();
	}

	public static void exercicio3() {
		String[] vogais = {"a", "e", "i", "o", "u"};
		
		String texto = "Uma frase qualquer para o exercicio";
		
		for(int i = 0; i<vogais.length; i++) {
			texto = texto.replace(vogais[i], vogais[i].toUpperCase());
		}
		
		System.out.println(texto);
	}

	public static void exercicio4() {
		Scanner scanner = new Scanner(System.in);
		
		String cpf = scanner.nextLine();
		
		if(cpf.matches("\\d{11}") || cpf.matches("\\d{3}[.]\\d{3}[.]\\d{3}[-]\\d{2}")) {
			String cpfLimpo = cpf.replaceAll("[.-]", "");
			int primeiroDigito = 0;
			int segundoDigito = 0;
			
			char[] numeros = cpfLimpo.toCharArray();
			
			int primeiraSoma = 0;
			
			for(int i = 0; i<9; i++) {
				primeiraSoma += Integer.parseInt(String.valueOf(numeros[i])) * (10 - i);
			}
			
			if(primeiraSoma % 11 < 2) {
				primeiroDigito = 0;
			}else {
				primeiroDigito = 11 - (primeiraSoma % 11);
			}
			
			int segundaSoma = 0;
			
			for(int i = 0; i<10; i++) {
				segundaSoma += Integer.parseInt(String.valueOf(numeros[i])) * (11 - i);
			}
			
			if(segundaSoma % 11 < 2) {
				segundoDigito = 0;
			}else {
				segundoDigito = 11 - (segundaSoma % 11);
			}
			
			if(primeiroDigito == Integer.parseInt(String.valueOf(numeros[9])) && segundoDigito == Integer.parseInt(String.valueOf(numeros[10]))) {
				System.out.println("CPF valido");
			}else {
				System.out.println("CPF invalido");
			}
		}else {
			System.out.println("NOK");
		}
		
		scanner.close();
	}


	public static void exercicio5() {
		String textoDigitado = null;
		Scanner scanner = new Scanner(System.in);
		
		textoDigitado = scanner.nextLine();
		
		System.out.println(textoDigitado.length());
		System.out.println(textoDigitado.toUpperCase());
		
		int count = 0;
		String vogais = "aeiou";
		for(int i = 0; i < textoDigitado.length(); i++) {
			if(vogais.indexOf(textoDigitado.charAt(i)) > -1) {
				count++;
			}
		}
		
		System.out.println(count);
		
		System.out.println(textoDigitado.toUpperCase().startsWith("UNI"));
		System.out.println(textoDigitado.toUpperCase().endsWith("RIO"));
		
		String digitos = "0123456789";
		int countD = 0;
		for(int i = 0; i < textoDigitado.length(); i++) {
			if(digitos.indexOf(textoDigitado.charAt(i)) > -1) {
				countD++;
			}
		}
		
		System.out.println(countD);
		scanner.close();
	}

	public static void exercicio6() {
		String texto = "abcdef";
		char[] textoVetorizado = texto.toLowerCase().toCharArray();
		int letraA = 'a';
		int letraZ = 'z';
		
		for(int i = 0; i<textoVetorizado.length; i++) {
			int letraAscii = textoVetorizado[i];
			
			int distanciaAoA = letraAscii - letraA;
			int letraNovaAscii = letraZ - distanciaAoA;
			char letraNova = (char)letraNovaAscii;
			
			textoVetorizado[i] = letraNova;
		}
		
		String novoTexto = String.valueOf(textoVetorizado);
		
		System.out.println(novoTexto);
	}

	public static void exercicio7() {
		String nomeCompleto = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		nomeCompleto = scanner.nextLine();
		
		String[] partesDoNome = nomeCompleto.split(" ");
		
		String primeiroNome = partesDoNome[0];
		String ultimoNome = partesDoNome[partesDoNome.length-1];
		
		primeiroNome = String.valueOf(primeiroNome.charAt(0)).toUpperCase() + primeiroNome.substring(1);
		ultimoNome = String.valueOf(ultimoNome.charAt(0)).toUpperCase() + ultimoNome.substring(1);
		
		System.out.println(primeiroNome + ultimoNome);
		
		scanner.close();
	}

	public static void exercicio8() {
		String texto = "ABCABCABC";
		
		String[] textoDividido = texto.split("AB");
		int ultimaPosicao = texto.lastIndexOf("AB");
		
		if(ultimaPosicao + "AB".length() == texto.length()) {
			System.out.println(textoDividido.length);
		}else {			
			System.out.println(textoDividido.length - 1);
		}
	}
	
	
	public static void exercicio9() {
		String texto = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		
		String[] opcoes = {"00", "11", "22", "33", "44", "55", "66", "77", "88", "99"};
		
		int[] contadores = {0,0,0,0,0,0,0,0,0,0};
		
		for(int i = 0; i<texto.length()-1; i++) {
			if(texto.charAt(i) == texto.charAt(i + 1)) {
				String duplicado = String.valueOf(texto.charAt(i)) + String.valueOf(texto.charAt(i + 1));
				
				
				boolean encontrou = false;
				int posicao = 0;
				
				while(!encontrou && posicao < opcoes.length) {
					if(duplicado.equalsIgnoreCase(opcoes[posicao])) {
						encontrou = true;
					}
					posicao++;
				}
				if(encontrou)
				contadores[posicao-1] = contadores[posicao-1] + 1; 
				
				
			}
		}
		
		int posicaoMaior = -1;
		int maior = -1;
		
		for(int i = 0; i<contadores.length; i++) {
			if(contadores[i] > maior) {
				posicaoMaior = i;
				maior = contadores[i];
			}
		}
		
		System.out.printf("O numero que mais aparece duplicado eh: %s", opcoes[posicaoMaior]);
	}

}
