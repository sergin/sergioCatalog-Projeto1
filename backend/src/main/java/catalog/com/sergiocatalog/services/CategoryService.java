package catalog.com.sergiocatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import catalog.com.sergiocatalog.dto.CategoryDTO;
import catalog.com.sergiocatalog.entities.Category;
//import catalog.com.sergiocatalog.resources.CategoryResource;
import catalog.com.sergiocatalog.respositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDTO> findAll(){
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	
		
		//PODE SER FEITO ASSIM TB
	/*	List<CategoryDTO> listDto = new ArrayList<>();
		for(Category cat : list) {
			listDto.add(new CategoryDTO(cat));
		}*/
		
	}
	
}
