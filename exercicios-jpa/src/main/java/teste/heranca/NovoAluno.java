package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {

		DAO<Aluno> alunoDao = new DAO<>();

		Aluno aluno1 = new Aluno(3184L, "João");
		AlunoBolsista aluno2 = new AlunoBolsista(4869L, "Maria", 1000);

		alunoDao.incluirAtomico(aluno1);
		alunoDao.incluirAtomico(aluno2);
		alunoDao.fecharC();
	}
}
