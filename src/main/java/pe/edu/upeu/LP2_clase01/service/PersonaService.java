package pe.edu.upeu.LP2_clase01.service;

import java.util.List;

import pe.edu.upeu.LP2_clase01.entity.Persona;

public interface PersonaService {
		Persona create(Persona p);
		Persona update(Persona p);
		void delete(Integer id);
		Persona read(Integer id);
		List<Persona> readAll();

}
