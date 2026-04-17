package uk.gov.ons.census.supporttool.model.dto.messaging;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.gov.ons.census.supporttool.model.dto.ui.RefusalTypeDTO;

@Data
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
public class RefusalDTO {
  private UUID caseId;
  private RefusalTypeDTO type;
}
