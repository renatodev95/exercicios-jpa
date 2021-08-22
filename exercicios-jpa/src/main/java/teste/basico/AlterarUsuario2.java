package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L); // classe Usuario, ID 7L tipo long
		usuario.setNome("Leonardo Alterado");
		usuario.setEmail("leonardo@lanche.com.br");
		
		em.merge(usuario); // este corresponde ao UPDATE do registro
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}
}
