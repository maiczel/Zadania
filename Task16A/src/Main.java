public class Main {
    public static void main(String[] args){

        Name name1 = new Name();
        name1.setName1("Tomek");
        System.out.println(name1.getName1());

        Name name2 = new Name();
        name2.setName1("Tomek");
        System.out.println(name2.getName1());

        if(name1 == name2);
        System.out.println("name1 == name2");

        if(name1.equals(name2)){
            System.out.println("name1.equals(name2)");
        }

        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());

    }
}
