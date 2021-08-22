package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 7L); // classe Usuario, ID 7L tipo long
		em.detach(usuario); // desativando o estado gerenciado para esse objeto

		usuario.setNome("Leonardo");
		em.merge(usuario); // tornando o objeto em gerenciado novamente e fazendo a persistência

		em.getTransaction().commit();

		em.close();
		emf.close();
	}
}
