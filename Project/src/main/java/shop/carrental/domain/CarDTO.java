package shop.carrental.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CarDTO {

	private Long seq;

	private String model, trim, description;

	int year, image_seq, price, segment_seq, fuel_seq, manufacturer_seq;

}