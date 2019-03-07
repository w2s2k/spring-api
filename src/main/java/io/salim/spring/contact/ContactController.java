package io.salim.spring.contact;

import io.salim.spring.contact.Contact;
import io.salim.spring.contact.ContactJpaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactJpaRepository contactJpaRepository;
	
	@GetMapping(value="")
	public List<Contact> index() {
		return contactJpaRepository.findAll();
	}
	
	@GetMapping(value="/{name}")
	public Contact findByName(@PathVariable final String name) {
		return contactJpaRepository.findByName(name);
	}
	
	@PostMapping(value="/load")
	public Contact load(@RequestBody final Contact contacts) {
		contactJpaRepository.save(contacts);
		return contactJpaRepository.findByName(contacts.getName());
	}
}
