package tlmi.user.domain;

import tlmi.user.algebra.TlmiTranslateUserAlgebra;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class TlmiTranslateUser extends TlmiTranslateUserAlgebra {
}
