package shop.carrental.domain;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerAnswerDTO {

	private Long seq;
	private String title, content;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date register_date, update_date;

}