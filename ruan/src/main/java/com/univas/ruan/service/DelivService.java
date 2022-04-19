package com.univas.ruan.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.univas.ruan.DTO.DelivDTO;
import com.univas.ruan.dao.DeliveryDAO;
import com.univas.ruan.exceptions.InvalidDataException;
import com.univas.ruan.exceptions.ObjectNotFoundException;
import com.univas.ruan.model.Delivery;

public class DelivService {

	@Autowired
	private DeliveryDAO delivDao;

	public List<DelivDTO> getAllDelivs() {
		List<Delivery> listDeliv = delivDao.findAll();

		return listDeliv.stream().map(delivery -> new DelivDTO(delivery)).collect(Collectors.toList());
	}

	public Delivery getDelivById(@PathVariable Long code) {
		if (code == null) {
			throw new InvalidDataException("code não deve ser null.");
		}
		Optional<Delivery> obj = delivDao.findById(code);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Delivery nao foi encontrado " + code));
	}

	public void createDelivery(DelivDTO dto) {
		Delivery delivery = toDelivery(dto);
		delivDao.save(delivery);
	}

	private Delivery toDelivery(DelivDTO dto) {
		Delivery delivery = new Delivery();

		delivery.setCep(dto.getCep());
		delivery.setDeliveryDate(dto.getDeliveryDate());
		delivery.setReceiverCPF(dto.getReceiverCpf());
		delivery.setStatus(dto.getStatus());
		return delivery;
	}

	public void updateDelivery(DelivDTO dto, Long code) {
		if (dto == null) {
			throw new InvalidDataException("Delivery não pode ser null.");
		}
		Delivery delivery = getDelivById(code);
		updateDeliv(dto, delivery);
		delivDao.save(delivery);
	}

	private void updateDeliv(DelivDTO dto, Delivery delivery) {
		delivery.setCep(dto.getCep());
		delivery.setReceiverCPF(dto.getReceiverCpf());
		delivery.setStatus(dto.getStatus());
	}

	public void deleteDelivery(Long code) {
		Delivery delivery = getDelivById(code);
		delivDao.delete(delivery);
	}
}
