class Farm {     
  private Animal[] animalPen = new Animal[3];
  public Farm() {
    animalPen[0] = new NamedCow("cow", "Elsie", "moo");
    animalPen[1] = new Chick("chick", "cluck", "cheep");
    animalPen[2] = new Pig("pig", "oink");
  }
  public void animalSounds() {
    for(int i = 0; i < animalPen.length; i++) {
      System.out.println(animalPen[i].getType() + " goes " + animalPen[i].getSound());
    }
    System.out.println("This cow is known as " + ((NamedCow)animalPen[0]).getName());
  }
}