public class Cat extends Animal {
  public static void main(String[] args) {
    Cat cat = new Cat();
    cat.setFamily("Cat");
    cat.setName("Puppy");
    System.out.println("cat's family: " + cat.family);
    System.out.println("cat's name  : " + cat.name);
    System.out.println("cat's ears  : " + cat.ears);
    System.out.println("cat's eyes  : " + cat.eyes);
    System.out.println("cat's legs  : " + cat.legs);
  }
}
