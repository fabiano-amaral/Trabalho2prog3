
//import DaoJPA.AlunoJpaDao;
import model.dao.*;
import model.dao.jpa.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.pojo.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Fabiano
 */
public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Trabalho2prog3PU");
        Turma t = new Turma(10, 10, "sala", 20, "10", null, null);
        TurmaDao turmadao = new TurmaDaoJpa(emf);
        turmadao.create(t);
        emf.close();
    }
}
