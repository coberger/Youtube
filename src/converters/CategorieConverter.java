package converters;

import java.io.Serializable;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import DAO.CategorieDAO;
import youtubeBis.Categorie;

@FacesConverter(forClass=Categorie.class)
public class CategorieConverter implements Converter, Serializable {

    private static final long serialVersionUID = 7053414108213420057L;

    private final CategorieDAO dao = new CategorieDAO();

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {
        Categorie cat = dao.findByName(value);
        return cat;
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        return ((Categorie) value).getNom();
    }
}
