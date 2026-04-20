package uk.gov.ons.census.supporttool.model.dto.messaging;

import java.util.UUID;
import lombok.Data;

@Data
public class InvalidCaseDTO {
  private UUID caseId;
  private String reason;
}
