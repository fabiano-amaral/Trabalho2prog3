/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import DaoJPA.exceptions.NonexistentEntityException;
import java.util.List;
import javax.persistence.EntityManager;
import model.pojo.Aluno;

/**
 *
 * @author Fabiano
 */
public interface AlunoDao {
    public EntityManager getEntityManager();
    public void create(Aluno aluno);
    public void edit(Aluno aluno) throws NonexistentEntityException, Exception;
    public void destroy(Long id) throws NonexistentEntityException;
    public List<Aluno> findAlunoEntities();
    public List<Aluno> findAlunoEntities(int maxResults, int firstResult);
    public Aluno findAluno(Long id);
    public int getAlunoCount();
    
}
