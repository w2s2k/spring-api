package io.salim.spring.contact;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import io.salim.spring.contact.Contact;

@Component
public interface ContactJpaRepository extends JpaRepository<Contact, Long> {

	Contact findByName(String name);

}
