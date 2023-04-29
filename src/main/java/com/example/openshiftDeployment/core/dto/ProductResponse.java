package com.example.openshiftDeployment.core.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductResponse {

    public String productId;
    public String name;
    @JsonProperty("@type")
    public String type;
    public String quantity;

}
