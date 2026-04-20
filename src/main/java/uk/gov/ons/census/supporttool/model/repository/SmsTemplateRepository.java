package uk.gov.ons.census.supporttool.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.SmsTemplate;

public interface SmsTemplateRepository extends JpaRepository<SmsTemplate, String> {}
