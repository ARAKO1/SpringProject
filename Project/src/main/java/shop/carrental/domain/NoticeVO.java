package shop.carrental.domain;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class NoticeVO {

	private int seq, count, good, bad, category;
	private String title, writer, content;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date register_date, update_date;

}