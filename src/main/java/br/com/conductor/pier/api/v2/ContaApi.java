package br.com.conductor.pier.api.v2;

import com.sun.jersey.api.client.GenericType;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiClient;
import br.com.conductor.pier.api.v2.invoker.Configuration;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.Conta;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidade;
import br.com.conductor.pier.api.v2.model.CartaoImpressao;
import br.com.conductor.pier.api.v2.model.Fatura;
import java.util.Date;
import br.com.conductor.pier.api.v2.model.PageTransacaoResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen")

public class ContaApi {
  private ApiClient apiClient;

  public ContaApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ContaApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Alterar limite
   * Esse recurso permite realizar a altera\u00C3\u00A7\u00C3\u00A3o dos Limites de uma determinada Conta.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param limiteGlobal Apresenta o valor do limite de cr\u00C3\u00A9dito que o portador do cart\u00C3\u00A3o possui.
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Nacionais.
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es de compras parceladas.
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade.
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional.
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Nacional dentro de cada ciclo de faturamento.
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00C3\u00A9dito que ele poder\u00C3\u00A1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00C3\u00A1rio/vencimentos.
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para uso exclusivo em Compras Internacionais.
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador possui para realizar transa\u00C3\u00A7\u00C3\u00B5es Internacionais de Compras Parceladas.
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade.
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional.
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00C3\u00A9dito que o portador pode utilizar para realizar transa\u00C3\u00A7\u00C3\u00B5es de Saque Internacional dentro de cada ciclo de faturamento.
   * @return Conta
   */
  public Conta alterarLimiteUsingPUT(Long id, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteGlobal' is set
     if (limiteGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteCompra' is set
     if (limiteCompra == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteCompra' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteParcelado' is set
     if (limiteParcelado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteParcelado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteParcelas' is set
     if (limiteParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteParcelas' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteSaqueGlobal' is set
     if (limiteSaqueGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteSaqueGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteSaquePeriodo' is set
     if (limiteSaquePeriodo == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteSaquePeriodo' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteConsignado' is set
     if (limiteConsignado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteConsignado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalCompra' is set
     if (limiteInternacionalCompra == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalCompra' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalParcelado' is set
     if (limiteInternacionalParcelado == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelado' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalParcelas' is set
     if (limiteInternacionalParcelas == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalParcelas' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalSaqueGlobal' is set
     if (limiteInternacionalSaqueGlobal == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaqueGlobal' when calling alterarLimiteUsingPUT");
     }
     
     // verify the required parameter 'limiteInternacionalSaquePeriodo' is set
     if (limiteInternacionalSaquePeriodo == null) {
        throw new ApiException(400, "Missing the required parameter 'limiteInternacionalSaquePeriodo' when calling alterarLimiteUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-limites".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Alterar vencimento
   * Esse recurso permite alterar o vencimento de uma conta especifica.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param novoDiaVencimento Novo dia de vencimento.
   * @return Conta
   */
  public Conta alterarVencimentoUsingPUT(Long id, Integer novoDiaVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling alterarVencimentoUsingPUT");
     }
     
     // verify the required parameter 'novoDiaVencimento' is set
     if (novoDiaVencimento == null) {
        throw new ApiException(400, "Missing the required parameter 'novoDiaVencimento' when calling alterarVencimentoUsingPUT");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/alterar-vencimento".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "novo_dia_vencimento", novoDiaVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "PUT", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta os limites da conta
   * Este m\u00C3\u00A9todo permite consultar os Limites configurados para uma determinada Conta, a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return LimiteDisponibilidade
   */
  public LimiteDisponibilidade consultarLimiteDisponibilidadeUsingGET1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLimiteDisponibilidadeUsingGET1");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<LimiteDisponibilidade> returnType = new GenericType<LimiteDisponibilidade>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Apresenta dados de uma determinada conta
   * Este m\u00C3\u00A9todo permite consultar dados de uma determinada conta a partir de seu codigo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @return Conta
   */
  public Conta consultarUsingGET1(Long id) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling consultarUsingGET1");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}".replaceAll("\\{format\\}","json")
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

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Realiza a gera\u00C3\u00A7\u00C3\u00A3o de um novo cart\u00C3\u00A3o para impress\u00C3\u00A3o avulsa
   * 
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param idPessoa C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da pessoa (id).
   * @return CartaoImpressao
   */
  public CartaoImpressao gerarCartaoUsingPOST(Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling gerarCartaoUsingPOST");
     }
     
     // verify the required parameter 'idPessoa' is set
     if (idPessoa == null) {
        throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling gerarCartaoUsingPOST");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/pessoas/{id_pessoa}/gerar-cartao".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "id_pessoa" + "\\}", apiClient.escapeString(idPessoa.toString()));

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

    
    GenericType<CartaoImpressao> returnType = new GenericType<CartaoImpressao>() {};
    return apiClient.invokeAPI(path, "POST", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Listar Faturas da Conta
   * Atrav\u00C3\u00A9s desta opera\u00C3\u00A7\u00C3\u00A3o os Emissores ou Portadores poder\u00C3\u00A3o consultar todo o Hist\u00C3\u00B3rico de Faturas vinculados a uma determinada Conta, independentemente do valor delas.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param dataVencimento Data de Vencimento da Fatura.
   * @return Fatura
   */
  public Fatura listarFaturasUsingGET(Long id, Integer page, Integer limit, Date dataVencimento) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling listarFaturasUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/faturas".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataVencimento", dataVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Fatura> returnType = new GenericType<Fatura>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Lista contas existentes na base de dados do Emissor
   * Este recurso permite listar contas existentes na base de dados do Emissor.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de conta (id).
   * @param idProduto C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do produto ao qual a conta faz parte. (id).
   * @param idOrigemComercial C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Origem Comercial (id) que deu origem a Conta.
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa Titular da Conta (id).
   * @param idStatusConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   * @param diaVencimento Apresenta o dia de vencimento.
   * @param melhorDiaCompra Apresenta o melhor dia de compra.
   * @param dataStatusConta Apresenta a data em que o idStatusConta atual fora atribu\u00C3\u00ADdo para ela.
   * @param dataCadastro Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   * @param dataUltimaAlteracaoVencimento Apresenta a data da ultima altera\u00C3\u00A7\u00C3\u00A3o de vencimento.
   * @return Conta
   */
  public Conta listarUsingGET1(Integer page, Integer limit, Long id, Long idProduto, Long idOrigemComercial, Long idPessoa, Long idStatusConta, Integer diaVencimento, Integer melhorDiaCompra, Date dataStatusConta, Date dataCadastro, Date dataUltimaAlteracaoVencimento) throws ApiException {
    Object postBody = null;
    
    // create path and map variables
    String path = "/api/contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(apiClient.parameterToPairs("", "id", id));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idOrigemComercial", idOrigemComercial));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(apiClient.parameterToPairs("", "idStatusConta", idStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "diaVencimento", diaVencimento));
    
    queryParams.addAll(apiClient.parameterToPairs("", "melhorDiaCompra", melhorDiaCompra));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataStatusConta", dataStatusConta));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataCadastro", dataCadastro));
    
    queryParams.addAll(apiClient.parameterToPairs("", "dataUltimaAlteracaoVencimento", dataUltimaAlteracaoVencimento));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<Conta> returnType = new GenericType<Conta>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
  /**
   * Permite listar uma linha do tempo com os eventos da conta
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir a listagem, em formato de timeline, dos eventos vinculados a uma detemrinada conta. Transa\u00C3\u00A7\u00C3\u00B5es, fechamento da fatura, pagamentos, gera\u00C3\u00A7\u00C3\u00A3o de cart\u00C3\u00B5es e altera\u00C3\u00A7\u00C3\u00A3o de limite s\u00C3\u00A3o exemplos de eventos contemplados por esta funcionalidade. Neste m\u00C3\u00A9todo, as opera\u00C3\u00A7\u00C3\u00B5es s\u00C3\u00A3o ordenadas de forma decrescente.
   * @param id C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (id).
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageTransacaoResponse
   */
  public PageTransacaoResponse transacoesUsingGET(Long id, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
     // verify the required parameter 'id' is set
     if (id == null) {
        throw new ApiException(400, "Missing the required parameter 'id' when calling transacoesUsingGET");
     }
     
    // create path and map variables
    String path = "/api/contas/{id}/timeline".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, Object> formParams = new HashMap<String, Object>();

    
    queryParams.addAll(apiClient.parameterToPairs("", "page", page));
    
    queryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    

    

    

    final String[] accepts = {
      "application/json"
    };
    final String accept = apiClient.selectHeaderAccept(accepts);

    final String[] contentTypes = {
      "application/json"
    };
    final String contentType = apiClient.selectHeaderContentType(contentTypes);

    String[] authNames = new String[] {"client_id", "access_token" };

    
    GenericType<PageTransacaoResponse> returnType = new GenericType<PageTransacaoResponse>() {};
    return apiClient.invokeAPI(path, "GET", queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    
  }
  
}

