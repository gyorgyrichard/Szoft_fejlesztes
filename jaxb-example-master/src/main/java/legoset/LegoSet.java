package legoset;


import album.Track;
import lombok.Data;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme", "year", "pieces","tags","minifigs", "weights", "url"})
@Data
public class LegoSet {




    @XmlAttribute
    private String number;

    private String name;
    private String theme;
    private String subtheme;
    private String url;
    private int pieces;



    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year year;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private List<Weight> weights;


    public String getNumber() { return number; }
    public void setNumber(String number) { this.number = number; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name  = name;
    }

    public String getTheme() { return theme; }
    public void setTheme(String theme) {
    this.theme = theme;
    }

    public String getSubTheme() {
        return subtheme;
    }
    public void setSubTheme(String subtheme) {
        this.subtheme = subtheme;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public int getPieces(){return pieces;}
    public void setPieces(int pieces) {
        this.pieces= pieces;
    }

    public Set<String> getTags() { return tags; }
    public void setTags(Set<String> tags) {
        this.tags = tags;
    }

    public List<Minifig> getMinifigs() { return minifigs; }
    public void setMinifigs(List<Minifig> minifigs) { this.minifigs = minifigs; }

    //public List<Minifig> getMinifigs() { return minifigs; }
    //public void setMinifigs(List<Minifig> names) { this.minifigs= minifigs;}

    public List<Weight> getWeights() { return weights; }
    public void setWeights(ArrayList<Weight> weights) { this.weights = weights; }

    public void setUrl(String url) { this.url = url; }


}
