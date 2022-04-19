package com.univas.ruan.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.univas.ruan.DTO.DelivDTO;
import com.univas.ruan.dao.AuditingDAO;
import com.univas.ruan.model.Delivery;
import com.univas.ruan.service.DelivService;

@RestController
@RequestMapping("/deliveries")
public class DeliveryController {
	
	
	@Autowired
	private DelivService service;
	private AuditingDAO audDao;
	
	
	@GetMapping()
	public List<DelivDTO> getAllDelivs(){
		return service.getAllDelivs();
	}
	
	
	@GetMapping("/{orderCode}")
    public DelivDTO getProductById(@PathVariable Long orderCode) {
        Delivery deliv = service.getDelivById(orderCode);
        return new DelivDTO(deliv);
    }

    @PutMapping("/{orderCode}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateDeliv(@RequestBody @Valid DelivDTO dto, @PathVariable Long orderCode) {
        service.updateDelivery(dto, orderCode);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createDeliv(@RequestBody @Valid DelivDTO dto) {
        service.createDelivery(dto);
    }

    @DeleteMapping("/{orderCode}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDeliv(@PathVariable Long orderCode) {
        service.deleteDelivery(orderCode);
    }
	

}
