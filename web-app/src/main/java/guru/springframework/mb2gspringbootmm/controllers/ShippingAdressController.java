package guru.springframework.mb2gspringbootmm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import guru.springframework.mb2gspringbootmm.model.ShippingAddress;

@RestController
public class ShippingAdressController {

    @RequestMapping("/")
    public ShippingAddress getShippingAddress() {

        return new ShippingAddress();
    }
}
