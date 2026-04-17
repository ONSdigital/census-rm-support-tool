package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.FulfilmentSurveySmsTemplate;
import uk.gov.ons.census.common.model.entity.SmsTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface FulfilmentSurveySmsTemplateRepository
    extends JpaRepository<FulfilmentSurveySmsTemplate, UUID> {
  List<FulfilmentSurveySmsTemplate> findBySurvey(Survey survey);

  boolean existsFulfilmentSurveySmsTemplateBySmsTemplateAndSurvey(
      SmsTemplate smsTemplate, Survey survey);
}
