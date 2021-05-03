public class AnimalTest {
  public static void main(String[] args) {
    Cat cat = new Cat();
    Cow cow = new Cow();

    cat.setOwner("John");
    Animal acat = (Animal)cat;
    System.out.println(acat.getOwner());

    System.out.println(cow.sound);
    Animal acow = (Animal)cow;
    System.out.println(acow.getOwner());

    Cat bcat = (Cat)acat;
    System.out.println(bcat.getOwner());
  }
}
