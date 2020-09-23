package shop.carrental.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import shop.carrental.mappers.RentalMapper;

@Log4j
@Service
@AllArgsConstructor
public class LongTermServiceImpl implements LongTermService {

	private RentalMapper rentalMapper;

	@Override
	public void list(Model model) {
		log.info("list");
	}

}