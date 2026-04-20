package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.ExportFileTemplate;
import uk.gov.ons.census.common.model.entity.FulfilmentSurveyExportFileTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface FulfilmentSurveyExportFileTemplateRepository
    extends JpaRepository<FulfilmentSurveyExportFileTemplate, UUID> {
  List<FulfilmentSurveyExportFileTemplate> findBySurvey(Survey survey);

  boolean existsFulfilmentSurveyExportFileTemplateByExportFileTemplateAndSurvey(
      ExportFileTemplate exportFileTemplate, Survey survey);
}
