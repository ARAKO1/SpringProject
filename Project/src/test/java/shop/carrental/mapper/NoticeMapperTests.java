package shop.carrental.mapper;

import java.util.List;
import java.util.function.Consumer;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import shop.carrental.domain.Criteria;
import shop.carrental.domain.NoticeDTO;
import shop.carrental.mappers.NoticeMapper;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class NoticeMapperTests {

	@Setter(onMethod_ = @Autowired)
	private NoticeMapper noticeMapper;

	@Test
	public void testGetNoticeList() {
		Criteria criteria = new Criteria(2);
		noticeMapper.getNoticeList(criteria).forEach(new Consumer<NoticeDTO>() {

			@Override
			public void accept(NoticeDTO notice) {
				log.info(notice);
			}
		});
	}

	/*
	 * @Test public void testInsert() { NoticeDTO dto = new NoticeDTO();
	 * dto.setTitle("Title"); dto.setContent("Content"); dto.setWriter("Writer");
	 * 
	 * noticeMapper.(dto);
	 * 
	 * log.info(dto); }
	 */

	@Ignore
	@Test
	public void testGetNotice() {
		NoticeDTO dto = noticeMapper.read(87L);
		log.info(dto);
	}

	/*
	 * public void testDelete() { log.info("Delete Count: " +
	 * noticeMapper.delete(42L)); }
	 */

	@Test
	public void testSearch() {
		Criteria criteria = new Criteria();
		criteria.setKeyword("4");
		criteria.setSearchBy("content");
		criteria.setPageNumber(5);

		List<NoticeDTO> list = noticeMapper.getNoticeList(criteria);

		list.forEach(notice -> log.info(notice));

		int total = noticeMapper.getTotal(criteria);
		log.info("전체 건수: " + total);
	}

	@Test
	public void testTotal() {
		Criteria criteria = new Criteria();
		criteria.setKeyword("4");
		criteria.setSearchBy("all");

		noticeMapper.getTotal(criteria);
	}

}