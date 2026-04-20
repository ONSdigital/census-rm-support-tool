package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.Map;
import java.util.UUID;
import lombok.Data;

@Data
public class CaseSearchResult {
  public UUID id;
  public String caseRef;
  public Map<String, String> sample;
  public String collectionExerciseName;
}
