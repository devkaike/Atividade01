package aaaaaa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraArq {
	public static void main(String[] args) {
		try {
			ArrayList < Funcionario > lista = new  ArrayList <>();
			ArrayList < Filhos > listaF = new ArrayList <>();
			String f = "";
			BufferedReader in = new BufferedReader(new FileReader("/home/puc/eclipse-workspace/aaaaaa/Atividade"));
			String frase = "";
			Scanner dado = new Scanner(System.in);
			int seq = 0;
			try {
				do {
					String s = JOptionPane.showInputDialog(null, "Informe um valor inteiro", "entrada de dados", 1);
					seq = Integer.valueOf(s);
				}while(seq < 1 || seq > 98);
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro!", "entrada de dados", 1);
			}
			
			while(in.ready()) {
				ManipulacaoDeString x = new ManipulacaoDeString();
				frase = in.readLine();
				x.separaFrase(frase,seq);
				//System.out.print(x.getSequencia()+" - "+x.getNome()+" - "+x.getSalario() +" - "+ x.getGratificacao()+"\n"+ x.getMostraDep());
				Funcionario a = new Funcionario(x.getSequencia(), x.getMatricula(), x.getNome(), x.getSalario(), x.getGratificacao());
				lista.add(a);seq++;
				Filhos fi = new Filhos(x.getMostraDep());
				listaF.add(fi);
				//lista.get(0);
				
			}
			String ff = "";
			for(int x = 0; x < lista.size(); x++) {
				Funcionario a;
				a = lista.get(x);
				Filhos n= listaF.get(x);
				
				ff += a.getSeq()+" - "+ a.getMatricula()+" - "+ a.getNome() +" - "+ a.getSalario() +" - "+ a.getGratificacao()+"\n"+n.getDados()+"\n";
				//JOptionPane.showMessageDialog(null, a.getSeq()+" - "+ a.getNome() +" - "+ a.getSalario() +" - "+ a.getGratificacao()+"\n"+n.getDados()+"\n", "FUNCIONARIOS", x, null);
			}
			JOptionPane.showMessageDialog(null, ff, "FUNCIONARIOS", 1, null);

		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Erro!", "Leitura de arquivo", 1);
		}
	}
}
