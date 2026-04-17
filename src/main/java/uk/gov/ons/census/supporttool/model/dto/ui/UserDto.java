package uk.gov.ons.census.supporttool.model.dto.ui;

import java.util.UUID;
import lombok.Data;

@Data
public class UserDto {
  private UUID id;
  private String email;
}
