package AbstractClass;

public class AbsSub extends AbsParent {

    AbsSub(String passion) {
        super(passion);
    }

    @Override
    void career(String name) {
        System.out.printf("I want to be a %s and my passion is in %s", name, this.passion);
    }
}
