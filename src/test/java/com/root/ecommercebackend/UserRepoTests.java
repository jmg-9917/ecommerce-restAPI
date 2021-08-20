package com.root.ecommercebackend;

import com.root.ecommercebackend.model.address.Address;
import com.root.ecommercebackend.model.email.Email;
import com.root.ecommercebackend.model.payment.Payment;
import com.root.ecommercebackend.model.phone.Phone;
import com.root.ecommercebackend.model.user.User;
import com.root.ecommercebackend.repo.UserRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepoTests {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private UserRepo userRepo;

    @Test
    public void testCreateUser() {
        User newUser = new User();
        newUser.setUser_ID(1);
        newUser.setFirst_name("Jorge");
        newUser.setLast_name("Munoz");
        newUser.setGender("M");
        newUser.setDate_of_birth(LocalDate.of(2001,6,23));

        Address newAddress = new Address();
        newAddress.setAddress("Casa 1");
        newAddress.setAddress_type("Home");
        newAddress.setPrimary_address(true);
        newAddress.setApt_suite("12");
        newAddress.setCity("Ens");
        newAddress.setCountry("Mx");
        newAddress.setState("bc");
        newAddress.setUser_ID(1);

        Phone newPhone = new Phone();
        newPhone.setPhone_ID(1);
        newPhone.setPhone_number(6461263);
        newPhone.setCountry_code(123);
        newPhone.setArea_code(32);
        newPhone.setExtention(2323);
        newPhone.setPhone_type("primary");
        newPhone.setPrimary_phone(true);
        newPhone.setUser_ID(1);

        Email newEmail = new Email();
        newEmail.setEmail_ID(1);
        newEmail.setEmail("abc@hotmail.com");
        newEmail.setEmail_type("personal");
        newEmail.setPrimary_email(true);
        newEmail.setUser_ID(1);

        Payment newPayment = new Payment();
        newPayment.setPayment_ID(1);
        newPayment.setCredit_card_number("12312313121");
        newPayment.setCredit_card_type("AXP");
        newPayment.setCredit_card_name_different("Jorg");
        newPayment.setCredit_card_exp_month(3);
        newPayment.setCredit_card_exp_year(2021);
        newPayment.setCredit_card_exp_code(213);
        newPayment.setCredit_card_sec_code(123);
        newPayment.setPrimary_payment(true);
        newPayment.setUser_ID(1);

        newUser.setPrimary_address(1);
        newUser.setPrimary_phone(1);
        newUser.setPrimary_email(1);
        newUser.setPrimary_payment(1);

        User savedUser =userRepo.save(newUser);
        User existUser = entityManager.find(User.class, savedUser.getUser_ID());

        assertThat(newUser.getFirst_name().equals(existUser.getFirst_name()));

    }

}
