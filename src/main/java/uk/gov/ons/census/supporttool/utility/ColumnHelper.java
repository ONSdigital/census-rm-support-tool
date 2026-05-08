package uk.gov.ons.census.supporttool.utility;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import uk.gov.ons.census.common.validation.ColumnValidators;

public class ColumnHelper {
  public static Set<String> getSurveyColumns() {
    return Arrays.stream(ColumnValidators.getValidators())
        .map(columnValidator -> columnValidator.getColumnName())
        .collect(Collectors.toSet());
  }
}
