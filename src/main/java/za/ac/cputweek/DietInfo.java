package za.ac.cputweek;

public class DietInfo {

    String personName;
    int dayNumber;
    int weight;

    public DietInfo(String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "DietInfo{" +
                "personName='" + personName + '\'' +
                ", dayNumber=" + dayNumber +
                ", weight=" + weight +
                '}';
    }

    public void setDayNumberAndWeight(int dayNumber,int weight)
    {
        this.dayNumber =dayNumber;
        this.weight =weight;
    }

    public Memento save()
    {
        return new Memento(personName, dayNumber,weight);
    }

    public void restore(Object objMemento)
    {
        Memento memento =(Memento)objMemento;
        personName =memento.mementoPersonName;
        dayNumber =memento.mementoDaynumber;
        weight =memento.mementoWeight;
    }

    private class Memento
    {
        String mementoPersonName;
        int mementoDaynumber;
        int mementoWeight;

        public Memento(String mementoPersonName, int mementoDaynumber, int mementoWeight) {
            this.mementoPersonName = mementoPersonName;
            this.mementoDaynumber = mementoDaynumber;
            this.mementoWeight = mementoWeight;
        }
    }

}
