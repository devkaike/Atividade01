package aaaaaa;

public class ManipulacaoDeString {
	private String salario, gratificacao, nome, sequencia,
	nomeDep, dataDep, mostraDep, sexoDep, matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMostraDep() {
		return mostraDep;
	}

	public void setMostraDep(String mostraDep) {
		this.mostraDep = mostraDep;
	}

	public String getNome() {
		return nome;
	}

	public String getDataDep() {
		return dataDep;
	}

	public void setDataDep(String dataDep) {
		this.dataDep = dataDep;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void separaFrase(String frase, int n) {
		//String[] nSeparado = frase.split("\n");//separa por quebra de linha
		String[] x = frase.split("-");//separa por -
		String seq = x[0];
		nome = x[1];
		String sal = x[2];
		String grat = x[3];
		matricula = seq;
		mSeq(seq, n);
		mGratificacao(grat);
		mSalario(sal);
		int i = 0;
		i = x.length - 4;
		mostraDep = "";
		if(i != 0) {
			for(int j = 0; j < i; j = j + 3) {
				
				nomeDep = x[j+4];
				String data = x[j+5];
				manipulaData(data);
				if(x[j+6].charAt(0) == 'M') {
					sexoDep = "MASCULINO";
				}else {
					sexoDep = "FEMININO";
				}
				mostraDep += "     "+nomeDep +" - "+ dataDep +" - "+ sexoDep+"\n";
			}
			
		}else {
			
			mostraDep = "                <Sem filhos>\n";
		}
	}
	public String mSeq(String s, int n) {
		String aux ="";
		s = "";
		if(n > 99) {
			s = String.valueOf(n++);
			
		}else {
			if(n >= 10) {
				s = "0";
				s += String.valueOf(n++);
			}else {
				s = "00";
				s += String.valueOf(n++);
			}
		}
		sequencia = s;
		return sequencia;
	}
	public String getNomeDep() {
		return nomeDep;
	}

	public void setNomeDep(String nomeDep) {
		this.nomeDep = nomeDep;
	}

	public String getSequencia() {
		return sequencia;
	}

	public void setSequencia(String sequencia) {
		this.sequencia = sequencia;
	}

	public String getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(String gratificacao) {
		this.gratificacao = gratificacao;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	public void manipulaData(String dt) {
		String aux ="";
		aux += dt.charAt(0);
		aux += dt.charAt(1);
		aux += "/";
		aux += dt.charAt(2);
		aux += dt.charAt(3);
		aux += "/";
		aux += dt.charAt(4);
		aux += dt.charAt(5);
		aux += dt.charAt(6);
		aux += dt.charAt(7);
		dataDep = aux;
	}
	public String mGratificacao(String grat) {
		String aux = "";
		String aux1 = "";
		aux += "R$";
		int a = 0;
		while(grat.length() != a && grat.charAt(a) == '0') {
			a++;
		}
		//if(sal.charAt(0) == '0') {
			for(int i = a; i < grat.length(); i ++) {
				aux1 += grat.charAt(i);
			}
			grat = aux1;
		//}
		if(a == grat.length()) {
			aux += "0,0";
		}else {
			if(grat.length() == 7) {
				aux += grat.charAt(0);
				aux += grat.charAt(1);
				aux += ".";
				aux += grat.charAt(2);
				aux += grat.charAt(3);
				aux += grat.charAt(4);
				aux += ",";
				aux += grat.charAt(5);
				aux += grat.charAt(6);
			}
			if(grat.length() == 6) {
				aux += grat.charAt(0);
				aux += ".";
				aux += grat.charAt(1);
				aux += grat.charAt(2);
				aux += grat.charAt(3);
				aux += ",";
				aux += grat.charAt(4);
				aux += grat.charAt(5);
			}
			if(grat.length() == 5) {
				aux += grat.charAt(0);
				aux += grat.charAt(1);
				aux += grat.charAt(2);
				aux += ",";
				aux += grat.charAt(3);
				aux += grat.charAt(4);
			}
			if(grat.length() == 4) {
				aux += grat.charAt(0);
				aux += grat.charAt(1);
				aux += ",";
				aux += grat.charAt(2);
				aux += grat.charAt(3);
			}
			if(grat.length() == 3) {
				aux += grat.charAt(0);
				aux += ",";
				aux += grat.charAt(1);
				aux += grat.charAt(2);
			}
			if(grat.length() == 2) {
				aux += grat.charAt(0);
				aux += ",";
				aux += grat.charAt(1);
			}
			if(grat.length() == 0) {
				aux += "0,0";
			}
		}
		
		gratificacao = aux;
		return gratificacao;
	}

	public String mSalario(String sal) {
		//salario = sal;
		String aux = "";
		String aux1 = "";
		aux += "R$";
		int a = 0;
		while(sal.length() != a && sal.charAt(a) == '0') {
			a++;
		}
		//if(sal.charAt(0) == '0') {
			
		//}
		for(int i = a; i < sal.length(); i++) {
				aux1 += sal.charAt(i);
			}
			sal = aux1;
		if(a == sal.length()) {
			aux += "0,0";
			
		}else {
			if(sal.length() == 7) {
				aux += sal.charAt(0);
				aux += sal.charAt(1);
				aux += ".";
				aux += sal.charAt(2);
				aux += sal.charAt(3);
				aux += sal.charAt(4);
				aux += ",";
				aux += sal.charAt(5);
				aux += sal.charAt(6);
			}
			if(sal.length() == 6) {
				aux += sal.charAt(0);
				aux += ".";
				aux += sal.charAt(1);
				aux += sal.charAt(2);
				aux += sal.charAt(3);
				aux += ",";
				aux += sal.charAt(4);
				aux += sal.charAt(5);
			}
			if(sal.length() == 5) {
				aux += sal.charAt(0);
				aux += sal.charAt(1);
				aux += sal.charAt(2);
				aux += ",";
				aux += sal.charAt(3);
				aux += sal.charAt(4);
			}
			if(sal.length() == 4) {
				aux += sal.charAt(0);
				aux += sal.charAt(1);
				aux += ",";
				aux += sal.charAt(2);
				aux += sal.charAt(3);
			}
			if(sal.length() == 3) {
				aux += sal.charAt(0);
				aux += ",";
				aux += sal.charAt(1);
				aux += sal.charAt(2);
			}
			if(sal.length() == 2) {
				aux += sal.charAt(0);
				aux += ",";
				aux += sal.charAt(1);
			}if(sal.length() == 0) {
				aux += "0,0";
			}
		}
		
		salario = aux;
		return salario;
	}
}
