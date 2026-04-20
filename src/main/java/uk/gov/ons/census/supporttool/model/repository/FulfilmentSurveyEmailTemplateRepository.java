package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.EmailTemplate;
import uk.gov.ons.census.common.model.entity.FulfilmentSurveyEmailTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface FulfilmentSurveyEmailTemplateRepository
    extends JpaRepository<FulfilmentSurveyEmailTemplate, UUID> {
  List<FulfilmentSurveyEmailTemplate> findBySurvey(Survey survey);

  boolean existsFulfilmentSurveyEmailTemplateByEmailTemplateAndSurvey(
      EmailTemplate emailTemplate, Survey survey);
}
