package co.develhope.api05.DTO;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString
public class CarDto {

    @NotBlank(message = "Mandatory")
    private String id;
    @NotBlank(message = "Mandatory")
    private String modelName;
    private double price;

    public CarDto(String id, String modelName, double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }
}
