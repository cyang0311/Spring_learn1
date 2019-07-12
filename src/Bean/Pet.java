package Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cat1")
public class Pet {
    private String petType;
    private String color;

    public Pet() {
    }

    public Pet(String petType, String color) {
        this.petType = petType;
        this.color = color;
    }

    public String getPetType() {
        return petType;
    }

    @Value("美短")
    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getColor() {
        return color;
    }

    @Value("黄白")
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bean.Pet{" +
                "petType='" + petType + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
