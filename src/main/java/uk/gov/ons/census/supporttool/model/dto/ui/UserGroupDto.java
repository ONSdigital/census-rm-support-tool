package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.UUID;
import lombok.Data;

@Data
public class UserGroupDto {
  private UUID id;
  private String name;
  private String description;
}
