public class Programmer extends Employee {
  private String language;
    public Programmer(String name, String surname, int age, String language){
      super(name,surname,age);
      this.language= language;
    }

    @Override  //annotation
    public void work() {
        super.work();
    }
    public void showInfo(){
        super.showInfo();
      System.out.println("language: "+language);
    }
}
// when we write super(); that means go and call constructor of super class
// when we write super. that means go and call method or variable of super class
// Override means = go and call a method from super class and write something over it
