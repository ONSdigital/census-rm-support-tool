package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.ActionRuleSurveyEmailTemplate;
import uk.gov.ons.census.common.model.entity.EmailTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface ActionRuleSurveyEmailTemplateRepository
    extends JpaRepository<ActionRuleSurveyEmailTemplate, UUID> {
  List<ActionRuleSurveyEmailTemplate> findBySurvey(Survey survey);

  boolean existsActionRuleSurveyEmailTemplateByEmailTemplateAndSurvey(
      EmailTemplate emailTemplate, Survey survey);
}
