package fr.treeptik.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.PersonneDAO;
import fr.treeptik.exception.DAOException;
import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Personne;

@Service
public class PersonneServiceImpl implements PersonneService {

	@Autowired
	private PersonneDAO personneDAO;
	
	
	@Override
	@Transactional
	public Personne save(Personne personne) throws ServiceException{
		try {
			return personneDAO.save(personne);
		} catch (DAOException e) {
			throw new ServiceException("Erreur save personne", e);
		}
	}
	
	@Override
	@Transactional
	public Personne update(Personne personne) throws ServiceException{
		try {
			return personneDAO.update(personne);
		} catch (DAOException e) {
			throw new ServiceException("Erreur update personne", e);
		}
	}
	
	@Override
	@Transactional
	public void remove(Personne personne) throws ServiceException{
		try {
			personne = this.findById(personne.getId());
			personneDAO.remove(personne);
		} catch (DAOException e) {
			throw new ServiceException("Erreur remove personne", e);
		}
	}
	
	@Override
	public Personne findById(Integer id) throws ServiceException{
		try {
			return personneDAO.findById(id);
		} catch (DAOException e) {
			throw new ServiceException("Erreur findById personne", e);
		}
	}
	
	@Override
	public Personne findAll() throws ServiceException{
		try {
			return (Personne) personneDAO.findAll();
		} catch (DAOException e) {
			throw new ServiceException("Erreur findAll personne", e);
		}
	}
	
}
