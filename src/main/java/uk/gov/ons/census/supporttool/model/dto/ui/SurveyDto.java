package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.UUID;
import lombok.Data;
import uk.gov.ons.census.common.validation.ColumnValidator;

@Data
public class SurveyDto {
  private UUID id;
  private String name;
  private ColumnValidator[] sampleValidationRules;
  private boolean sampleWithHeaderRow;
  private char sampleSeparator;
  private String sampleDefinitionUrl;
  private Object metadata;
}
