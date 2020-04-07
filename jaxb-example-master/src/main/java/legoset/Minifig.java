package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Minifig {


    private String names;

    @XmlAttribute
    private int count;


    public Minifig() {}

    public Minifig(String names, int count){
        this.names = names;
        this.count = count;

    }


}

