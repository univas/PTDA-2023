import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Principal {
	
	public static String[] obterConteudo(String path) throws IOException {
		String[] conteudoDoArquivo;
		
		// abre o arquivo e cria caso não exista.
		File arquivo = new File(path);
		if(arquivo.createNewFile()) {
			// Se criar um arquivo novo já retorna com um vetor vazio.
			return new String[0];
		}
		
		// obtém tamanho do arquivo e cria o vetor de linhas
		long tamanhoDoArquivo = Files.lines(Paths.get(path)).count();
		
		conteudoDoArquivo = new String[(int)tamanhoDoArquivo];
		int count = 0;
		Scanner scan = new Scanner(arquivo);
		while(scan.hasNextLine()) {
			conteudoDoArquivo[count++] = scan.nextLine();
		}
		
		scan.close();
		
		return conteudoDoArquivo;
	}

	public static String[] adicionarLinhaNoArquivo(String path, String linha) throws IOException {
		String[] novoConteudo;
		
		// abre o arquivo e/ou cria se não existir
		File arquivo = new File(path);
		arquivo.createNewFile();
		
		// abre o arquivo de modo a poder adicionar conteúdo
		FileWriter writer = new FileWriter(arquivo, true);
		
		// escreva a linha desejada e adiciona um salto de linha no arquivo
		writer.write(linha.concat("\n"));
		writer.close();
		
		novoConteudo = obterConteudo(path);
		
		return novoConteudo;
	}
	
	public static void main(String[] args) throws IOException {
		String[] conteudo = obterConteudo("F:\\workspace\\java\\file.csv");
		
		for(int i =0; i<conteudo.length; i++) {
			System.out.println(conteudo[i]);
		}
		System.out.println("Add nova linha");
		String[] novoConteudo = adicionarLinhaNoArquivo("F:\\workspace\\java\\file.csv", "Marcos, teste, 203"); 
		
		for(int i =0; i<novoConteudo.length; i++) {
			System.out.println(novoConteudo[i]);
		}		
	}

}
