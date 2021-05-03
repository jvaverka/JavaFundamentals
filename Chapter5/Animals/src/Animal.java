public class Animal {
  int legs;
  int ears;
  int eyes;
  String family;
  String name;
  String owner;

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

  public String getOwner() {
    return this.owner;
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;
  }

  public void setOwner(String newName) {
    this.owner = newName;
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
