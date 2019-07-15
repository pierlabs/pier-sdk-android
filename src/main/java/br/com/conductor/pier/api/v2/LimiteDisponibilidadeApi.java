package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LimiteDisponibilidadeResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PagePIEROfLimiteDisponibilidadeLogResponse;
import br.com.conductor.pier.api.v2.model.SensibilizarSaldoGlobalUpdate;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class LimiteDisponibilidadeApi {
  String basePath = "http://localhost/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Realiza a altera\u00E7\u00E3o dos limites da conta
   * Esse recurso permite realizar a altera\u00E7\u00E3o dos Limites de uma determinada Conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da Conta
   * @param limiteGlobal Apresenta o valor do limite de cr\u00E9dito que o portador do cart\u00E3o possui
   * @param limiteCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Nacionais
   * @param limiteParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es de compras parceladas
   * @param limiteParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras que forem realizadas nesta modalidade
   * @param limiteSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional
   * @param limiteSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Nacional dentro de cada ciclo de faturamento
   * @param limiteConsignado Quando utilizado pelo emissor, este campo apresenta o valor da margem de cr\u00E9dito que ele poder\u00E1 utilizar para ser cobrado de forma consignada (desconto em folha) em seu sal\u00E1rio/vencimentos
   * @param limiteInternacionalCompra Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para uso exclusivo em Compras Internacionais
   * @param limiteInternacionalParcelado Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador possui para realizar transa\u00E7\u00F5es Internacionais de Compras Parceladas
   * @param limiteInternacionalParcelas Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que portador pode acumular a partir da soma das parcelas das compras internacionais que forem realizadas nesta modalidade
   * @param limiteInternacionalSaqueGlobal Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional
   * @param limiteInternacionalSaquePeriodo Quando utilizado pelo emissor, este campo apresenta o valor do limite de cr\u00E9dito que o portador pode utilizar para realizar transa\u00E7\u00F5es de Saque Internacional dentro de cada ciclo de faturamento
   * @param limiteMaximo Valor m\u00E1ximo do limite de cr\u00E9dito para realizar transa\u00E7\u00F5es
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  alterarLimitesDisponiveis (Long idConta, BigDecimal limiteGlobal, BigDecimal limiteCompra, BigDecimal limiteParcelado, BigDecimal limiteParcelas, BigDecimal limiteSaqueGlobal, BigDecimal limiteSaquePeriodo, BigDecimal limiteConsignado, BigDecimal limiteInternacionalCompra, BigDecimal limiteInternacionalParcelado, BigDecimal limiteInternacionalParcelas, BigDecimal limiteInternacionalSaqueGlobal, BigDecimal limiteInternacionalSaquePeriodo, BigDecimal limiteMaximo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling alterarLimitesDisponiveis");
    }
    

    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteGlobal", limiteGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteCompra", limiteCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelado", limiteParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteParcelas", limiteParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaqueGlobal", limiteSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteSaquePeriodo", limiteSaquePeriodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteConsignado", limiteConsignado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalCompra", limiteInternacionalCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelado", limiteInternacionalParcelado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalParcelas", limiteInternacionalParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaqueGlobal", limiteInternacionalSaqueGlobal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteInternacionalSaquePeriodo", limiteInternacionalSaquePeriodo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limiteMaximo", limiteMaximo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os limites da conta
   * Este m\u00E9todo permite consultar os Limites configurados para uma determinada Conta, a partir do c\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param idConta Id Conta
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  consultarLimitesDisponiveis1 (Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarLimitesDisponiveis1");
    }
    

    // create path and map variables
    String path = "/api/limites-disponibilidades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista o hist\u00F3rico de limites
   * Este recurso permite listar o hist\u00F3rico de limites disponibilidades
   * @param id C\u00F3digo identificador da conta
   * @param dataAlteracaoInicio Data inicial para busca de hist\u00F3ricos por per\u00EDodo
   * @param dataAlteracaoFim Data final para busca de hist\u00F3ricos por per\u00EDodo
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PagePIEROfLimiteDisponibilidadeLogResponse
   */
  public PagePIEROfLimiteDisponibilidadeLogResponse  listarHistoricoAlteracoesLimitesDisponiveis (Long id, String dataAlteracaoInicio, String dataAlteracaoFim, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoAlteracoesLimitesDisponiveis");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades/historicos".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoInicio", dataAlteracaoInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAlteracaoFim", dataAlteracaoFim));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PagePIEROfLimiteDisponibilidadeLogResponse) ApiInvoker.deserialize(response, "", PagePIEROfLimiteDisponibilidadeLogResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Sensibilizar uma quantidade de cr\u00E9dito de global de uma conta
   * Este m\u00E9todo permite sensibilizar, para mais ou para menos, a quantidade de cr\u00E9dito global de uma conta
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   * @param sensibilizarSaldoGlobal sensibilizarSaldoGlobal
   * @return LimiteDisponibilidadeResponse
   */
  public LimiteDisponibilidadeResponse  sensibilizarSaldoDisponivelGlobal (Long id, SensibilizarSaldoGlobalUpdate sensibilizarSaldoGlobal) throws ApiException {
    Object postBody = sensibilizarSaldoGlobal;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling sensibilizarSaldoDisponivelGlobal");
    }
    
    // verify the required parameter 'sensibilizarSaldoGlobal' is set
    if (sensibilizarSaldoGlobal == null) {
       throw new ApiException(400, "Missing the required parameter 'sensibilizarSaldoGlobal' when calling sensibilizarSaldoDisponivelGlobal");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/limites-disponibilidades/sensibilizar-saldo-disponivel-global".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (LimiteDisponibilidadeResponse) ApiInvoker.deserialize(response, "", LimiteDisponibilidadeResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
