package uk.gov.ons.census.supporttool.endpoint;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import uk.gov.ons.census.supporttool.model.repository.SurveyRepository;
import uk.gov.ons.census.supporttool.security.AuthUser;

@ExtendWith(MockitoExtension.class)
public class CollectionExerciseEndpointTest {
  @Mock SurveyRepository surveyRepository;
  @Mock AuthUser authUser; // This is required, trust me

  @InjectMocks CollectionExerciseEndpoint underTest;
}
