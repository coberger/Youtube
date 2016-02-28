package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.CategorieDAO;
import youtubeBis.Categorie;

@ManagedBean
@SessionScoped
public class CategorieBean implements Serializable{

	private List<Categorie> categories = new ArrayList<>();
	
	@PostConstruct
	public void init(){
		categories.addAll(new CategorieDAO().getAllCategorie());
	}
	
	public List<Categorie> getCategories(){
		return categories;
	}
}
