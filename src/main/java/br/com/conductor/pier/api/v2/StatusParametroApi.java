package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.EstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.StatusContaResponse;
import br.com.conductor.pier.api.v2.model.StatusImpressaoResponse;
import br.com.conductor.pier.api.v2.model.PageEstagioCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageTipoBoletoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusCartaoResponse;
import br.com.conductor.pier.api.v2.model.PageStatusContaResponse;
import br.com.conductor.pier.api.v2.model.PageStatusImpressaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class StatusParametroApi {
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
   * Apresenta os dados de um determinado Estagio Cart\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Est\u00E1gio de Entrega do Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Entrega do Cart\u00E3o (id)
   * @return EstagioCartaoResponse
   */
  public EstagioCartaoResponse  consultarEstagioCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarEstagioCartao");
    }
    

    // create path and map variables
    String path = "/api/estagios-cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EstagioCartaoResponse) ApiInvoker.deserialize(response, "", EstagioCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Status Cart\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status de Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Est\u00E1gio de Entrega do Cart\u00E3o (id)
   * @return StatusCartaoResponse
   */
  public StatusCartaoResponse  consultarStatusCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusCartao");
    }
    

    // create path and map variables
    String path = "/api/status-cartoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StatusCartaoResponse) ApiInvoker.deserialize(response, "", StatusCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Status Conta
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status Conta a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id)
   * @return StatusContaResponse
   */
  public StatusContaResponse  consultarStatusConta (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusConta");
    }
    

    // create path and map variables
    String path = "/api/status-contas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StatusContaResponse) ApiInvoker.deserialize(response, "", StatusContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Status Impress\u00E3o
   * Este m\u00E9todo permite consultar os par\u00E2metros de um determinado Status de Impress\u00E3o do Cart\u00E3o a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status de Impress\u00E3o do Cart\u00E3o (id)
   * @return StatusImpressaoResponse
   */
  public StatusImpressaoResponse  consultarStatusImpressaoCartao (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarStatusImpressaoCartao");
    }
    

    // create path and map variables
    String path = "/api/status-impressoes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (StatusImpressaoResponse) ApiInvoker.deserialize(response, "", StatusImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Est\u00E1gios do Cart\u00E3o
   * Este m\u00E9todo permite que sejam listadas as op\u00E7\u00F5es de Est\u00E1gio de Entrega que podem ser atribu\u00EDdas aos Cart\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Id do est\u00E1gio cart\u00E3o
   * @param nome Nome do est\u00E1gio cart\u00E3o
   * @return PageEstagioCartaoResponse
   */
  public PageEstagioCartaoResponse  listarEstagiosCartoes (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/estagios-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    

    

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
        return (PageEstagioCartaoResponse) ApiInvoker.deserialize(response, "", PageEstagioCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar status CNAB sumarizados
   * Lista os status CNAB sumarizados existentes
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @return PageTipoBoletoResponse
   */
  public PageTipoBoletoResponse  listarStatusCNABSumarizados (List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-cnab-sumarizados".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
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
        return (PageTipoBoletoResponse) ApiInvoker.deserialize(response, "", PageTipoBoletoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Status do Cart\u00E3o
   * Este m\u00E9todo permite que sejam listadas as possibilidades de Status que podem ser atribu\u00EDdas aos Cart\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status do Cart\u00E3o (id)
   * @param nome Nome atribu\u00EDdo ao Status de Entrega do Cart\u00E3o
   * @param permiteDesbloquear Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo
   * @param permiteAtribuirComoBloqueio Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo
   * @param permiteAtribuirComoCancelamento Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo
   * @param cobrarTarifaAoEmitirNovaVia Par\u00E2metro que define se o status do cart\u00E3o permite a reativa\u00E7\u00E3o do cart\u00E3o, sendo: 0: Inativo e 1: Ativo
   * @return PageStatusCartaoResponse
   */
  public PageStatusCartaoResponse  listarStatusCartoes (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteDesbloquear, Integer permiteAtribuirComoBloqueio, Integer permiteAtribuirComoCancelamento, Integer cobrarTarifaAoEmitirNovaVia) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cobrarTarifaAoEmitirNovaVia", cobrarTarifaAoEmitirNovaVia));
    

    

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
        return (PageStatusCartaoResponse) ApiInvoker.deserialize(response, "", PageStatusCartaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Status Contas cadastrados para o Emissor
   * Este m\u00E9todo permite que sejam listados os Status Contas existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do Status da Conta (id)
   * @param nome Nome atribu\u00EDdo ao Status da Conta
   * @param permiteAlterarVencimento Par\u00E2metro que define se o Status da conta permite a solicita\u00E7\u00E3o da altera\u00E7\u00E3o do Dia para Vencimento das Faturas, sendo: 0: Inativo e 1: Ativo
   * @param permiteAlterarLimite Par\u00E2metro que define se o Status da conta permite altera\u00E7\u00E3o de Limites, sendo: 0: Inativo e 1: Ativo
   * @param permiteEmitirNovaViaCartao Par\u00E2metro que define se o Status da conta permite solicitar uma nova via de Cart\u00E3o, sendo: 0: Inativo e 1: Ativo
   * @param permiteFazerTransferencia Par\u00E2metro que define se o Status da conta permite originar Transfer\u00EAncias de Cr\u00E9dito para outras Contas do mesmo Emissor ou para uma Conta Banc\u00E1ria, sendo: 0: Inativo e 1: Ativo
   * @param permiteReceberTransferencia Par\u00E2metro que define se o Status da conta permite  receber Transfer\u00EAncias de Cr\u00E9dito originadas de outras Contas do mesmo emissor, sendo: 0: Inativo e 1: Ativo
   * @param permiteCriarAcordoCobranca Par\u00E2metro que define se o Status da conta permite ter um Acordo de Cobran\u00E7a de D\u00EDvida criado para ela, sendo: 0: Inativo e 1: Ativo
   * @param permiteAtribuirComoBloqueio Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para Bloquear temporariamente uma Conta, sendo: 0: Inativo e 1: Ativo
   * @param permiteDesbloquear Par\u00E2metro que define se o Status da conta permite ser desbloqueada, sendo: 0: Inativo e 1: Ativo
   * @param permiteAtribuirComoCancelamento Par\u00E2metro que define se o Status da conta permite ser atribu\u00EDdo para realizar o cancelamento definitivo de uma conta, sendo: 0: Inativo e 1: Ativo
   * @return PageStatusContaResponse
   */
  public PageStatusContaResponse  listarStatusConta (List<String> sort, Integer page, Integer limit, Long id, String nome, Integer permiteAlterarVencimento, Integer permiteAlterarLimite, Integer permiteEmitirNovaViaCartao, Integer permiteFazerTransferencia, Integer permiteReceberTransferencia, Integer permiteCriarAcordoCobranca, Integer permiteAtribuirComoBloqueio, Integer permiteDesbloquear, Integer permiteAtribuirComoCancelamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAlterarVencimento", permiteAlterarVencimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAlterarLimite", permiteAlterarLimite));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteEmitirNovaViaCartao", permiteEmitirNovaViaCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteFazerTransferencia", permiteFazerTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteReceberTransferencia", permiteReceberTransferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteCriarAcordoCobranca", permiteCriarAcordoCobranca));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoBloqueio", permiteAtribuirComoBloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteDesbloquear", permiteDesbloquear));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "permiteAtribuirComoCancelamento", permiteAtribuirComoCancelamento));
    

    

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
        return (PageStatusContaResponse) ApiInvoker.deserialize(response, "", PageStatusContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as op\u00E7\u00F5es de Status Impress\u00E3o
   * Este m\u00E9todo permite que sejam listadas as op\u00E7\u00F5es de Status Impress\u00E3o que podem ser atribu\u00EDdas aos Cart\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id Id do est\u00E1gio cart\u00E3o
   * @param nome Nome do status impress\u00E3o
   * @return PageStatusImpressaoResponse
   */
  public PageStatusImpressaoResponse  listarStatusImpressaoCartao (List<String> sort, Integer page, Integer limit, Long id, String nome) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-impressoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    

    

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
        return (PageStatusImpressaoResponse) ApiInvoker.deserialize(response, "", PageStatusImpressaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
