package fr.treeptik.service;

import fr.treeptik.exception.ServiceException;
import fr.treeptik.model.Personne;

public interface PersonneService {

	Personne save(Personne personne) throws ServiceException;

	Personne update(Personne personne) throws ServiceException;

	void remove(Personne personne) throws ServiceException;

	Personne findById(Integer id) throws ServiceException;

	Personne findAll() throws ServiceException;

}
