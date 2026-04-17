package uk.gov.ons.census.supporttool.model.dto.ui;

import java.time.OffsetDateTime;
import java.util.UUID;
import lombok.Data;
import uk.gov.ons.census.common.model.entity.EventType;

@Data
public class EventDto {
  private OffsetDateTime dateTime;
  private String description;
  private String channel;
  private String source;
  private EventType type;
  private UUID messageId;
  private UUID correlationId;
  private String payload;
}
