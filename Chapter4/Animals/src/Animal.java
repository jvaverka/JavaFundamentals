public class Animal {
  int legs;
  int ears;
  int eyes;
  String family;
  String name;

  public Animal() {
    this.legs = 4;
    this.ears = 2;
    this.eyes = 2;
  }

  public Animal(int newLegs, int newEars, int newEyes) {
    this.legs = newLegs;
    this.ears = newEars;
    this.eyes = newEyes;
  }

  // Getter
  public String getName() {
    return this.name;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }

  // Getter
  public String getFamily() {
    return this.family;
  }

  // Setter
  public void setFamily(String newFamily) {
    this.family = newFamily;
  }
}
