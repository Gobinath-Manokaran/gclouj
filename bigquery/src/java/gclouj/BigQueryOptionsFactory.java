package gclouj;

import com.google.cloud.bigquery.BigQueryOptions;

public class BigQueryOptionsFactory {
  public static BigQueryOptions create() {
    BigQueryOptions.Builder builder = BigQueryOptions.newBuilder();
    return builder.build();
  }
}
