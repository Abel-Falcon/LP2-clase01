package pe.edu.upeu.LP2_clase01.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.LP2_clase01.dao.PersonaDao;
import pe.edu.upeu.LP2_clase01.entity.Persona;
import pe.edu.upeu.LP2_clase01.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired
	private PersonaDao personaDao;
	@Override
	public Persona create(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.create(p);
	}

	@Override
	public Persona update(Persona p) {
		// TODO Auto-generated method stub
		return personaDao.update(p);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		personaDao.delete(id);
	}

	@Override
	public Persona read(Integer id) {
		// TODO Auto-generated method stub
		return personaDao.read(id);
	}

	@Override
	public List<Persona> readAll() {
		// TODO Auto-generated method stub
		return personaDao.readAll();
	}

}
