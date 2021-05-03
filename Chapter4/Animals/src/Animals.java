public class Animals {
  public static void main(String[] args) {
    Animal skip = new Animal();
    Animal spot = new Animal();
    Animal duke = new Animal(2, 2, 2);

    skip.setName("Skip");
    skip.setFamily("Dog");
    spot.setName("Spot");
    spot.setFamily("Cow");
    duke.setName("Duke");
    duke.setFamily("Goat");

    System.out.printf("%s is a %s.%n", skip.getName(), skip.getFamily());
    System.out.printf("%s is a %s.%n", spot.getName(), spot.getFamily());
    System.out.printf("%s is a %s.%n", duke.getName(), duke.getFamily());
  }
}
