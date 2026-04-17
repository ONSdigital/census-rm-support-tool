package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.ActionRuleSurveySmsTemplate;
import uk.gov.ons.census.common.model.entity.SmsTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface ActionRuleSurveySmsTemplateRepository
    extends JpaRepository<ActionRuleSurveySmsTemplate, UUID> {
  List<ActionRuleSurveySmsTemplate> findBySurvey(Survey survey);

  boolean existsActionRuleSurveySmsTemplateBySmsTemplateAndSurvey(
      SmsTemplate smsTemplate, Survey survey);
}
