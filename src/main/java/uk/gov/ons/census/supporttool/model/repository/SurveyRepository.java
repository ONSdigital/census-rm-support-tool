package uk.gov.ons.census.supporttool.model.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.Survey;

public interface SurveyRepository extends JpaRepository<Survey, UUID> {}
