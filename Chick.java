class Chick implements Animal{     
  private String myType, mySound, mySound2;
  private double chickRandomNumber = Math.random();
  public Chick(String type, String sound, String sound2) {
    myType = type;
    mySound = sound;
    mySound2 = sound2;
  }
  public Chick() {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getType() {
    return myType;
  }
  public String getSound() {
    if (chickRandomNumber < 0.5) {
      return mySound;
    }
    else {
      return mySound2;
    }
  }
}