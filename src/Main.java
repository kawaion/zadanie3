import Adapter.AdapterForUSA;
import Adapter.EuroPlug;
import Adapter.USASocket;
import Builder.PersonB;
import ChainOfResponsibility.*;
import Decorator.Cheese;
import Decorator.Olives;
import Decorator.Pepperoni;
import Decorator.Pizza;
import Proxy.PageWriter;
import Strategy.Dinar;
import Strategy.Dollar;
import Strategy.MoneyWriter;
import Strategy.Ruble;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MoneyWriter.Write(100, new Ruble());
        MoneyWriter.Write(100, new Dollar());
        MoneyWriter.Write(100, new Dinar());


        Person John = new Person(25, 100000, 2, 0);
        Credit credit = new Credit(John, 1000000, 5);
        var ageFilter = new AgeFilter();
        var incomeFilter = new IncomeFilter();
        var lifeFilter= new LifeFilter();
        var permanentJobFilter = new PermanentJobFilter();
        ageFilter.SetNext(incomeFilter).SetNext(lifeFilter).SetNext(permanentJobFilter);
        System.out.printf(CreditApprover.CheckApprove(credit, ageFilter));


        var personForBuilder = new PersonB.Builder().setAge(25).setIncome(50000).setWorkExperience(2).setCreditCount(0).build();
        System.out.println(personForBuilder.getIncome() + "\n");


        var writer = new PageWriter();
        var pageNumbers = new ArrayList<Integer>();
        pageNumbers.add(0);
        pageNumbers.add(3);
        pageNumbers.add(3);
        pageNumbers.add(3);
        pageNumbers.add(5);
        pageNumbers.add(5);
        System.out.println(writer.getPages(pageNumbers));


        System.out.println(new Pepperoni(new Olives( new Cheese(new Pizza()))).show());


        EuroPlug euro = new EuroPlug();
        AdapterForUSA adapter = new AdapterForUSA(euro);
        System.out.println(USASocket.inserted(adapter));
    }
}