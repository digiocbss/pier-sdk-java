package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.EstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusContaResponse;
import br.com.conductor.pier.api.v2.model.StatusImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageEstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusContaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusImpressaoResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")
public class StatusParametroApi {
  private ApiClient apiClient;

  public StatusParametroApi() {
    this(Configuration.getDefaultApiClient());
  }

  public StatusParametroApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Apresenta os dados de um determinado Estagio Cart\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Est\u00E1gio de Entrega do Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Entrega do Cart\u00E3o (id).
   * @return EstagioCartaoResponse
   */
  public EstagioCartaoResponse consultarEstagioCartaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstagioCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/estagios-cartoes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<EstagioCartaoResponse> returnType = new GenericType<EstagioCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Status Cart\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status de Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Entrega do Cart\u00E3o (id).
   * @return StatusCartaoResponse
   */
  public StatusCartaoResponse consultarStatusCartaoUsingGET(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusCartaoUsingGET");
     }
     
    // create path and map variables
    String path = "/api/status-cartoes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<StatusCartaoResponse> returnType = new GenericType<StatusCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Status Conta
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status Conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).
   * @return StatusContaResponse
   */
  public StatusContaResponse consultarUsingGET28(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET28");
     }
     
    // create path and map variables
    String path = "/api/status-contas/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<StatusContaResponse> returnType = new GenericType<StatusContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os dados de um determinado Status Impress\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status de Impress\u00E3o do Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id).
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status de Impress\u00E3o do Cart\u00E3o (id).
   * @return StatusImpressaoResponse
   */
  public StatusImpressaoResponse consultarUsingGET29(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET29");
     }
     
    // create path and map variables
    String path = "/api/status-impressoes/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<StatusImpressaoResponse> returnType = new GenericType<StatusImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Est\u00E1gios do Cart\u00E3o
   * Este m\u00E9todo permite que sejam listadas as op\u00E7\u00F5es de Est\u00E1gio de Entrega que podem ser atribu\u00EDdas aos Cart\u00F5es.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id Id do est\u00E1gio cart\u00E3o
   * @param nome Nome do est\u00E1gio cart\u00E3o
   * @return PageEstagioCartaoResponse
   */
  public PageEstagioCartaoResponse listarEstagiosCartoesUsingGET(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/estagios-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageEstagioCartaoResponse> returnType = new GenericType<PageEstagioCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Status do Cart\u00E3o
   * Este m\u00E9todo permite que sejam listadas as possibilidades de Status que podem ser atribu\u00EDdas aos Cart\u00F5es.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o (id) 
   * @param nome Nome atribu\u00EDdo ao Status de Entrega do Cart\u00E3o.
   * @param permiteDesbloquear Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   * @param permiteAtribuirComoBloqueio Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   * @param permiteAtribuirComoCancelamento Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   * @param cobrarTarifaAoEmitirNovaVia Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   * @return PageStatusCartaoResponse
   */
  public PageStatusCartaoResponse listarStatusCartoesUsingGET(List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteDesbloquear, Integer permiteAtribuirComoBloqueio, Integer permiteAtribuirComoCancelamento, Integer cobrarTarifaAoEmitirNovaVia) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "cobrarTarifaAoEmitirNovaVia", cobrarTarifaAoEmitirNovaVia));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageStatusCartaoResponse> returnType = new GenericType<PageStatusCartaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os tipos de transa\u00E7\u00F5es
   * Esse recurso permite listar os tipos de transa\u00E7\u00F5es dispon\u00EDveis.
   * @return List<Object>
   */
  public List<Object> listarTiposEventosTransacoesUsingGET() throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/tipos-eventos-transacoes".replaceAll("\\{format\\}","json");

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

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<List<Object>> returnType = new GenericType<List<Object>>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista os Status Contas cadastrados para o Emissor
   * Este m\u00E9todo permite que sejam listados os Status Contas existentes na base de dados do Emissor.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id).
   * @param nome Nome atribu\u00EDdo ao Status da Conta.
   * @param permiteAlterarVencimento Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo.
   * @param permiteAlterarLimite Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo.
   * @param permiteEmitirNovaViaCartao Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo.
   * @param permiteFazerTransferencia Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo.
   * @param permiteReceberTransferencia Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo.
   * @param permiteCriarAcordoCobranca Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo.
   * @param permiteAtribuirComoBloqueio Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo.
   * @param permiteDesbloquear Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo.
   * @param permiteAtribuirComoCancelamento Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo.
   * @return PageStatusContaResponse
   */
  public PageStatusContaResponse listarUsingGET38(List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteAlterarVencimento, Integer permiteAlterarLimite, Integer permiteEmitirNovaViaCartao, Integer permiteFazerTransferencia, Integer permiteReceberTransferencia, Integer permiteCriarAcordoCobranca, Integer permiteAtribuirComoBloqueio, Integer permiteDesbloquear, Integer permiteAtribuirComoCancelamento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAlterarVencimento", permiteAlterarVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAlterarLimite", permiteAlterarLimite));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteEmitirNovaViaCartao", permiteEmitirNovaViaCartao));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteFazerTransferencia", permiteFazerTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteReceberTransferencia", permiteReceberTransferencia));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteCriarAcordoCobranca", permiteCriarAcordoCobranca));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(apiClient.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageStatusContaResponse> returnType = new GenericType<PageStatusContaResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Status Impress\u00E3o
   * Este m\u00E9todo permite que sejam listadas as op\u00E7\u00F5es de Status Impress\u00E3o que podem ser atribu\u00EDdas aos Cart\u00F5es.
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @param id Id do est\u00E1gio cart\u00E3o
   * @param nome Nome do status impress\u00E3o
   * @return PageStatusImpressaoResponse
   */
  public PageStatusImpressaoResponse listarUsingGET39(List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/status-impressoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "nome", nome));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    //String[] authNames = new String[] {"client_id",  };
    String[] authNames = new String[] {"client_id", "access_token"};

    
    GenericType<PageStatusImpressaoResponse> returnType = new GenericType<PageStatusImpressaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}
