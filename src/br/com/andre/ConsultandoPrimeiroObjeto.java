package br.com.andre;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.andre.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cli = em.find(Cliente.class, 5L);
		
		if(cli != null){
			System.out.println("Nome: " + cli.getNome() + "\n"+ 
			           "Idade: " + cli.getIdade() + "\n"+
			           "Sexo: " + cli.getSexo() + "\n"+
			           "Profissão: " + cli.getProfissao());
		}else{
			System.out.println("Registro não encontrado");
		}
		

	}

}
