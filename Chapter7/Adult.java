/**
 * Adult
 */
public class Adult {

  public int age;
  public String sector;
  public int income;
  public String education;
  public int tenure;
  public String status;
  public String title;
  public String family;
  public String race;
  public String gender;
  public int number1;
  public int number2;
  public int number3;
  public String location;
  public String debt;

  public Adult(int age, String sector, int income, String education,
               int tenure, String status, String title, String family,
               String race, String gender, int number1, int number2,
               int number3, String location, String debt) {
    this.age = age;
    this.sector = sector;
    this.income = income;
    this.education = education;
    this.tenure = tenure;
    this.status = status;
    this.title = title;
    this.family = family;
    this.race = race;
    this.gender = gender;
    this.number1 = number1;
    this.number2 = number2;
    this.number3 = number3;
    this.location = location;
    this.debt = debt;
  }

  public static Adult fromValues(String [] values) {
    if (values[0].trim() == "") {
      System.out.println("reached end of values.");
      return null;
    }

    int age = Integer.parseInt(values[0].trim());
    String sector = values[1].trim();
    int income = Integer.parseInt(values[2].trim());
    String education = values[3].trim();
    int tenure = Integer.parseInt(values[4].trim());
    String status = values[5].trim();
    String title = values[6].trim();
    String family = values[7].trim();
    String race = values[8].trim();
    String gender = values[9].trim();
    int number1 = Integer.parseInt(values[10].trim());
    int number2 = Integer.parseInt(values[11].trim());
    int number3 = Integer.parseInt(values[12].trim());
    String location = values[13].trim();
    String debt = values[14].trim();

    return new Adult(age, sector, income, education, tenure, status,
                 title, family, race, gender, number1, number2,
                 number3, location, debt);
  }
}
