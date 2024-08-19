package pe.edu.upeu.LP2_clase01.dao;

import java.util.List;

import pe.edu.upeu.LP2_clase01.entity.Persona;

public interface PersonaDao {
	Persona create(Persona p);
	Persona update(Persona p);
	void delete(Integer id);
	Persona read(Integer id);
	List<Persona> readAll();
}
