package com.example.openshiftDeployment.adapter.inbound;

import com.example.openshiftDeployment.core.dto.ProductResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class Controller {
    ObjectMapper mapper = new ObjectMapper();

    @GetMapping("/test/productDetails")
    public ProductResponse getDetails() throws JsonProcessingException {
        log.info("Controller Start");
        ProductResponse productResponse = ProductResponse.builder()
                .productId("9090QWE").name("SAWA").quantity("45").type("RTY")
                .build();
        log.info("RES::{}",mapper.writeValueAsString(productResponse));
        log.info("Controller End");
        return productResponse;

    }
}
