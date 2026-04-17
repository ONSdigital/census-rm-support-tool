package uk.gov.ons.census.supporttool.model.dto.messaging;

import lombok.Data;

@Data
public class AllowedFulfilmentDto {
  private String packCode;
  private String description;
  private Object metadata;
}
