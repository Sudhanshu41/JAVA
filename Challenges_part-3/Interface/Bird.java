package Interface;

public abstract class Bird implements flyable{
    private String breed;

    public Bird(String breed) {
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
}
