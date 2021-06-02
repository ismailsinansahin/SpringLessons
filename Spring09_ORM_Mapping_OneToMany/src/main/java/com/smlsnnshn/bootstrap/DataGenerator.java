package com.smlsnnshn.bootstrap;

import com.smlsnnshn.entity.Address;
import com.smlsnnshn.entity.Person;
import com.smlsnnshn.repository.AddressRepository;
import com.smlsnnshn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Tom","Hanks");
        Person p3 = new Person("Julia","Roberts");

        Address a1 = new Address("King St","22041");
        Address a2 = new Address("Prince St","56987");
        Address a3 = new Address("Princess St","23441");

//        p1.setAddresses(Arrays.asList(a1,a2,a3));   //case-1

        personRepository.save(p1);                  //case-1

        a1.setPerson(p1);
        a2.setPerson(p1);
        a3.setPerson(p1);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);



    }

}
