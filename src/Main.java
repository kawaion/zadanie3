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
import Strategy.EconomyTariff;
import Strategy.Subscriber;
import Strategy.UnlimitedTariff;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Subscriber sub1 = new Subscriber(new EconomyTariff());
        sub1.addMinutes(150);
        sub1.addGb(3);
        sub1.addSms(200);
        System.out.println(sub1.showBill() + "\n");

        Subscriber sub2 = new Subscriber(new UnlimitedTariff());
        sub2.addMinutes(150);
        sub2.addGb(3);
        sub2.addSms(200);
        System.out.println(sub2.showBill() + "\n");


        Person John = new Person(25, 100000, 2, 0);
        Credit credit = new Credit(John, 1000000, 5);
        var ageFilter = new AgeFilter();
        var incomeFilter = new IncomeFilter();
        var lifeFilter = new LifeFilter();
        var permanentJobFilter = new PermanentJobFilter();
        ageFilter.setNext(incomeFilter).setNext(lifeFilter).setNext(permanentJobFilter);
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


        System.out.println(new Pepperoni(new Olives(new Cheese(new Pizza()))).show());


        EuroPlug euro = new EuroPlug();
        AdapterForUSA adapter = new AdapterForUSA(euro);
        System.out.println(USASocket.inserted(adapter));
    }
}