import java.util.Objects;

public class Name {
    private String name1;
    private String name2;

    public void setName1(String name1){
        this.name1 = name1;
    }
    public String getName1(){
        return name1;
    }
    public void setName2(String name2){
        this.name2 = name2;
    }

    public String getName2(){
        return name2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(name1, name.name1) && Objects.equals(name2, name.name2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name1, name2);
    }
}

