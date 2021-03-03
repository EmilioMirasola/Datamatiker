package term1.lesson12.modelchild;

public class Institution {
    private String navn;
    private String address;
    private Child[] children;
    private int numOfChildren;

    public Institution(String navn, String address) {
        this.navn = navn;
        this.address = address;
        this.numOfChildren = 0;
        this.children = new Child[10];
    }

    public void addChild(Child child) {
        this.children[numOfChildren] = child;
        numOfChildren++;
    }

    public double averageAge() {
        int sum = 0;
        for (int i = 0; i < numOfChildren; i++) {
            sum += children[i].getAge();
        }
        return (double) sum / this.numOfChildren;
    }

    public int numberOfGender(String gender) {
        int sum = 0;
        for (int i = 0; i < numOfChildren; i++) {
            if (gender.equalsIgnoreCase("Boy")) {
                if (children[i].isBoy()) {
                    sum++;
                }
            } else {
                if (!children[i].isBoy()) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public Child[] getChilds() {
        return this.children;
    }

    public String getAddress() {
        return address;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
