import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TestBean {

	public String doNavigate() {
		return "view-info";
	}

}
