
public class Application2 {
	public static void main(String[] args) {
		Aluno aluno=new Aluno();
		aluno.setAnoEntrada(2017);
		aluno.setPeriodoEntrada(1);
		aluno.setNome("Evelyn");
		aluno.setCpf("111");
		Endereco endereco=new Endereco();
		endereco.setRua("rua1");
		endereco.setNumero(1);
		endereco.setComplemento("casa");
		endereco.setCidade("recife");
		aluno.setEndereco(endereco);
		Professor prof =new Professor();
		prof.setNome("Gabriel");
		prof.setCpf("888");
		prof.setAdmissao(admissao);
		
		
		
		
	}

}
