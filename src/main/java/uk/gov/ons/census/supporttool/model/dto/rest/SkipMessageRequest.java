package uk.gov.ons.census.supporttool.model.dto.rest;

import lombok.Data;

@Data
public class SkipMessageRequest {
  private String messageHash;
  private String skippingUser;
}
