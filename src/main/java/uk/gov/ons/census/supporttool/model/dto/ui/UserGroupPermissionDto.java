package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.UUID;
import lombok.Data;
import uk.gov.ons.census.common.model.entity.UserGroupAuthorisedActivityType;

@Data
public class UserGroupPermissionDto {
  private UUID id;
  private UUID groupId;
  private UUID surveyId;
  private String surveyName;
  private UserGroupAuthorisedActivityType authorisedActivity;
}
