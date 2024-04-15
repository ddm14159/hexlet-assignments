package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

// BEGIN
@Getter
@Setter
@AllArgsConstructor

// END
public class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize() throws JsonProcessingException {
        var objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }


    public static Car unserialize(String data) throws IOException {
        var objectMapper = new ObjectMapper();

        return objectMapper.readValue(data, Car.class);
    }
    // END
}
