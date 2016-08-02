package br.com.conductor.pier.api.v1_1.invoker.auth;

import br.com.conductor.pier.api.v1_1.invoker.Pair;

import java.util.Map;
import java.util.List;

public interface Authentication {
  /** Apply authentication settings to header and query params. */
  void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}