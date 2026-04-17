package uk.gov.ons.census.supporttool.model.repository;

import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import uk.gov.ons.census.common.model.entity.UserGroupAdmin;

public interface UserGroupAdminRepository extends JpaRepository<UserGroupAdmin, UUID> {
  List<UserGroupAdmin> findByUserEmailIgnoreCase(String email);

  List<UserGroupAdmin> findByGroupId(UUID groupId);

  boolean existsByUserEmailIgnoreCase(String userEmail);
}
