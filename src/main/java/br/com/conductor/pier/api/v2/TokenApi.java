package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.BodyAccessToken;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class TokenApi {
  private ApiClient apiClient;

  public TokenApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TokenApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * /api/tokens/callback
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return BodyAccessToken
   */
  public BodyAccessToken callbackUsingPOST(BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
     // verify the required parameter 'bodyAccessToken' is set
     if (bodyAccessToken == null) {
        throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling callbackUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tokens/callback".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<BodyAccessToken> returnType = new GenericType<BodyAccessToken>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * /api/tokens/validar
   * 
   * @param bodyAccessToken bodyAccessToken
   * @return Object
   */
  public Object validarUsingPOST(BodyAccessToken bodyAccessToken) throws ApiException {
    Object postBody = bodyAccessToken;
    
     // verify the required parameter 'bodyAccessToken' is set
     if (bodyAccessToken == null) {
        throw new ApiException(400, "Missing the required parameter 'bodyAccessToken' when calling validarUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/tokens/validar".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Object> returnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
