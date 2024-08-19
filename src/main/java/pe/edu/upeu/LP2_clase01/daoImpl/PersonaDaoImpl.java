package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.PersonaDao;
import pe.edu.upeu.LP2_clase01.entity.Persona;
import pe.edu.upeu.LP2_clase01.repository.PersonaRepository;
@Component
public class PersonaDaoImpl implements PersonaDao{
	@Autowired
	private PersonaRepository personaRepository;
	@Override
	public Persona create(Persona p) {
		// TODO Auto-generated method stub
		return personaRepository.save(p);
	}

	@Override
	public Persona update(Persona p) {
		// TODO Auto-generated method stub
		return personaRepository.save(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personaRepository.deleteById(id);
		
	}

	@Override
	public Persona read(Integer id) {
		// TODO Auto-generated method stub
		return personaRepository.findById(id).get();
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personaRepository.findAll();
	}

}
