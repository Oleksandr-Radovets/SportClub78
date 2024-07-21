package org.example.sportclubteam78.service.impl;

import org.example.sportclubteam78.model.DataCart;
import org.example.sportclubteam78.repository.DateCartRepository;
import org.example.sportclubteam78.service.DateCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ValidationException;
import java.util.regex.Pattern;

@Service
public class DateCartServiceImpl implements DateCartService {

    @Autowired
    private DateCartRepository dateArtRepository;

    @Override
    public String createDateCart(DataCart dateCart) {

       if(verificationOfCard(dateCart.getCardNumber()) && verificationOfPhone(dateCart.getPhoneNumber())){
           boolean present = dateArtRepository.findById(dateCart.getId()).isPresent();
           if (present) {
               return "your dateCart already exists";
           }
           DataCart save = dateArtRepository.save(dateCart);
           return "your dateCart saved successfully";
       }
       throw new ValidationException("the card or phone number is incorrect");
    }

    @Override
    public void deleteDateCart(Long dataCartId) {
        dateArtRepository.deleteById(dataCartId);
    }

    private boolean verificationOfCard (String digital) {
        Pattern patternCard = Pattern
                .compile("^\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d$");
        return patternCard.matcher(digital).find();
    }

    private boolean verificationOfPhone (String digital) {
        Pattern patternCard = Pattern
                .compile("^\\+\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d$");
        return patternCard.matcher(digital).find();
    }

}
