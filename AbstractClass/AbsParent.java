package AbstractClass;

public abstract class AbsParent {
    String passion;

    AbsParent(String passion) {
        this.passion = passion;
    }
    abstract void career(String career);
}
