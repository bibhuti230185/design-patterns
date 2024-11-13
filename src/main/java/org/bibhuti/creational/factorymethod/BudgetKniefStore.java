package org.bibhuti.creational.factorymethod;

public class BudgetKniefStore extends KnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        if (knifeType.equals("type1")) {
            return new Type1Knief();
        } else if (knifeType.equals("type2")) {
            return new Type2Knief();
        } else {
            return null;
        }
    }

}
