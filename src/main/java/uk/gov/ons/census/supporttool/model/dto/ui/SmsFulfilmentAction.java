package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.Map;
import lombok.Data;

@Data
public class SmsFulfilmentAction {
  private String packCode;
  private String phoneNumber;
  private Object uacMetadata;
  private Map<String, String> personalisation;
}
