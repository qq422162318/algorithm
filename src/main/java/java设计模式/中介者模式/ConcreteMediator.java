package java设计模式.中介者模式;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {
    private Map<String ,Colleague> colleagueMapmap;
    private HashMap<String ,String> interMap;
    public ConcreteMediator() {
        colleagueMapmap=new HashMap<>();
        interMap=new HashMap<>();
    }

    @Override
    public void Register(String name, Colleague colleague) {
       colleagueMapmap.put(name, colleague);
       if (colleague instanceof Alarm){
           interMap.put("Alarm",name);
       }else if (colleague instanceof CoffeeMachine){
           interMap.put("CoffeeMachine",name);
       }else if (colleague instanceof Tv){
           interMap.put("TV",name);
       }else if (colleague instanceof Curtains){
           interMap.put("Curtains",name);
       }
    }

    @Override
    public void getMessage(int state, String name) {
        System.out.println(state+"--"+name);

    }

    @Override
    public void SendMessage() {

    }
}
