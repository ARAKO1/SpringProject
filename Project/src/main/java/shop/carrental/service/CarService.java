package shop.carrental.service;

import java.util.Date;
import java.util.List;
import shop.carrental.domain.CarVO;
import shop.carrental.domain.MfgcoDTO;
import shop.carrental.domain.SegmentDTO;
import shop.carrental.domain.ShortCarDTO;

public interface CarService {

	public List<MfgcoDTO> listMfgco();

	public List<SegmentDTO> listSegment();

	public List<CarVO> listCar(Long mfgco_seq, Long segment_seq);

	public List<ShortCarDTO> listShortCar(Date start_date, Date end_date, Long branch_seq);

}