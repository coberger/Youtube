package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import DAO.CategorieDAO;
import youtubeBis.Categorie;

@ManagedBean
@SessionScoped
public class CategorieBean implements Serializable{

	private List<Categorie> categories = new ArrayList<>();
	
	private Map<String, Categorie> categsForDropDownLists = new HashMap<>(); 
	
	@PostConstruct
	public void init(){
		new CategorieDAO().deleteAll();
		new CategorieDAO().add(new Categorie("Musique"));
		new CategorieDAO().add(new Categorie("Film"));
		new CategorieDAO().add(new Categorie("Sport"));
		new CategorieDAO().add(new Categorie("News"));
		new CategorieDAO().add(new Categorie("Gaming"));
		categories.addAll(new CategorieDAO().getAllCategorie());
		for(Categorie c : categories){
			categsForDropDownLists.put(c.getNom(), c);
		}
		
	}
	
	public List<Categorie> getCategories(){
		return categories;
	}

	/**
	 * @return the categsForDropDownLists
	 */
	public Map<String, Categorie> getCategsForDropDownLists() {
		return categsForDropDownLists;
	}

	/**
	 * @param categsForDropDownLists the categsForDropDownLists to set
	 */
	public void setCategsForDropDownLists(Map<String, Categorie> categsForDropDownLists) {
		this.categsForDropDownLists = categsForDropDownLists;
	}
}
