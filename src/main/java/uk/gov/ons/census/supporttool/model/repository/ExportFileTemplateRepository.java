package uk.gov.ons.census.supporttool.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.ExportFileTemplate;

public interface ExportFileTemplateRepository extends JpaRepository<ExportFileTemplate, String> {}
