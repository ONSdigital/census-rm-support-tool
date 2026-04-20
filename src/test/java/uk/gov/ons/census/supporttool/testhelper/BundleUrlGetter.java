package uk.gov.ons.census.supporttool.testhelper;

@FunctionalInterface
public interface BundleUrlGetter {
  String getUrl(BundleOfUsefulTestStuff bundle);
}
