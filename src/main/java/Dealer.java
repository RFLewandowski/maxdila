import lombok.Data;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
@Data
//@EJB
public class Dealer {
    String name;
    Integer health;
    Integer cash;
    Integer bankDeposit;
    Integer bankDebt;

    @PostConstruct
    public void init() {
        this.name = "Radek";
        this.health = 100;
        this.cash = 2000;
        this.bankDeposit = 0;
        this.bankDebt = 1000;
    }
}
