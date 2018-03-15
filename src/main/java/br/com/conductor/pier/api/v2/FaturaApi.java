package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.FaturaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PagePlanoParcelamentoResponse;
import br.com.conductor.pier.api.v2.model.PageFaturaResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class FaturaApi {
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
   * Consulta fatura de um cliente
   * Consulta fatura de um cliente pela data de vencimento.
   * @param dataVencimento Data Vencimento
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   * @return FaturaDetalheResponse
   */
  public FaturaDetalheResponse  consultarFaturaUsingGET1 (String dataVencimento, Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling consultarFaturaUsingGET1");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarFaturaUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/faturas/{dataVencimento}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "dataVencimento" + "\\}", apiInvoker.escapeString(dataVencimento.toString()));

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
        return (FaturaDetalheResponse) ApiInvoker.deserialize(response, "", FaturaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar planos de parcelamento
   * Lista os planos de parcelamento da fatura de uma conta.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   * @param dataVencimentoPadrao Indica a data de vencimento padr\u00E3o das faturas
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PagePlanoParcelamentoResponse
   */
  public PagePlanoParcelamentoResponse  consultarLancamentosFuturosFaturaUsingGET1 (Long id, String dataVencimentoPadrao, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarLancamentosFuturosFaturaUsingGET1");
    }
    
    // verify the required parameter 'dataVencimentoPadrao' is set
    if (dataVencimentoPadrao == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimentoPadrao' when calling consultarLancamentosFuturosFaturaUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/faturas/planos-parcelamento".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataVencimentoPadrao", dataVencimentoPadrao));
    

    

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
        return (PagePlanoParcelamentoResponse) ApiInvoker.deserialize(response, "", PagePlanoParcelamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Envia 2\u00AA via de fatura por E-mail
   * Envia a segunda via da fatura para o e-mail informado/cadastrado.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   * @param dataVencimento Data de Vencimento da fatura (yyyy-MM-dd).
   * @param email E-mail para envio da 2\u00AA via da fatura, caso n\u00E3o seja informado ser\u00E1 usado o e-mail cadastrado.
   * @return Object
   */
  public Object  enviarFaturaEmailUsingPOST (Long id, String dataVencimento, String email) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling enviarFaturaEmailUsingPOST");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling enviarFaturaEmailUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/faturas/{dataVencimento}/enviar-email".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "dataVencimento" + "\\}", apiInvoker.escapeString(dataVencimento.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    

    

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
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar faturas de um cliente.
   * Lista faturas de um cliente.
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   * @param situacaoProcessamento Status do processamento das faturas. Valores possiveis [ABERTA, FECHADA, TODAS].
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros.
   * @param page P\u00E1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default = 50, Max = 50)
   * @return PageFaturaResponse
   */
  public PageFaturaResponse  listarFaturasUsingGET1 (Long idConta, String situacaoProcessamento, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarFaturasUsingGET1");
    }
    

    // create path and map variables
    String path = "/api/faturas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "situacaoProcessamento", situacaoProcessamento));
    
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
        return (PageFaturaResponse) ApiInvoker.deserialize(response, "", PageFaturaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite visualizar o extrato da fatura em formato PDF
   * Esta opera\u00E7\u00E3o permite visualizar o extrato da fatura de uma determinada conta, em formato PDF. Quando ela for a fatura ativa, ou seja, a do m\u00EAs corrente, o pdf ser\u00E1 composto pelo extrato de lan\u00E7amentos e pela ficha de compensa\u00E7\u00E3o banc\u00E1ria. Quando for de uma fatura do hist\u00F3rico do cliente, o PDF ser\u00E1 composto apenas pelo extrato de transa\u00E7\u00F5es.
   * @param id C\u00F3digo de identifica\u00E7\u00E3o da conta (id).
   * @param dataVencimento Data de Vencimento da fatura.
   * @return Object
   */
  public Object  visualizarDocumentoUsingGET (Long id, String dataVencimento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling visualizarDocumentoUsingGET");
    }
    
    // verify the required parameter 'dataVencimento' is set
    if (dataVencimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataVencimento' when calling visualizarDocumentoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/faturas/{dataVencimento}/arquivo.pdf".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "dataVencimento" + "\\}", apiInvoker.escapeString(dataVencimento.toString()));

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
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
