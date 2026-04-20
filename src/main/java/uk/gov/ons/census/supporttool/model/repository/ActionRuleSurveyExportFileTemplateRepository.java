package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.ActionRuleSurveyExportFileTemplate;
import uk.gov.ons.census.common.model.entity.ExportFileTemplate;
import uk.gov.ons.census.common.model.entity.Survey;

public interface ActionRuleSurveyExportFileTemplateRepository
    extends JpaRepository<ActionRuleSurveyExportFileTemplate, UUID> {
  List<ActionRuleSurveyExportFileTemplate> findBySurvey(Survey survey);

  boolean existsActionRuleSurveyExportFileTemplateByExportFileTemplateAndSurvey(
      ExportFileTemplate exportFileTemplate, Survey survey);
}
