package catalog.com.sergiocatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import catalog.com.sergiocatalog.entities.Category;
//import catalog.com.sergiocatalog.resources.CategoryResource;
import catalog.com.sergiocatalog.respositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	
	}
	
}
