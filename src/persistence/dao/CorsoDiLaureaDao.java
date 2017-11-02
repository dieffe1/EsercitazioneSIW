package persistence.dao;

import java.util.List;

import model.CorsoDiLaurea;

public interface CorsoDiLaureaDao {
	public void save(CorsoDiLaurea corso);  // Create
	public CorsoDiLaurea findByPrimaryKey(Long codice);     // Retrieve
	public List<CorsoDiLaurea> findAll();       
	public void update(CorsoDiLaurea corso); //Update
	public void delete(CorsoDiLaurea corso); //Delete	
	
}
