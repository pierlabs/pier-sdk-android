package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.InscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.PageInscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.InscricaoAPN;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class InscricaoAPNApi {
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
   * Desativa uma inscri\u00E7\u00E3o APN
   * Desativa uma inscri\u00E7\u00E3o de notifica\u00E7\u00E3o APN do emissor
   * @param id id
   * @return InscricaoAPNResponse
   */
  public InscricaoAPNResponse  desativarInscricaoAPN (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarInscricaoAPN");
    }
    

    // create path and map variables
    String path = "/api/inscricoes-apn/{id}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (InscricaoAPNResponse) ApiInvoker.deserialize(response, "", InscricaoAPNResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista as inscri\u00E7\u00F5es APN
   * Lista as inscri\u00E7\u00F5es de notifica\u00E7\u00E3o APN do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param idCartoes Lista de ids dos cart\u00F5es inscritos
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param deviceToken Token do dispositivo
   * @param dataCriacao Data da cria\u00E7\u00E3o da inscri\u00E7\u00E3o
   * @param dataDesativacao Data da desativa\u00E7\u00E3o da inscri\u00E7\u00E3o
   * @param ativo Indica se a inscri\u00E7\u00E3o est\u00E1 ativa
   * @param idAplicacaoMobile Id da aplica\u00E7\u00E3o mobile
   * @return PageInscricaoAPNResponse
   */
  public PageInscricaoAPNResponse  listarInscricoesAPN (List<String> sort, List<Long> idCartoes, Integer page, Integer limit, String deviceToken, String dataCriacao, String dataDesativacao, Boolean ativo, Long idAplicacaoMobile) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "idCartoes", idCartoes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "deviceToken", deviceToken));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCriacao", dataCriacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataDesativacao", dataDesativacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idAplicacaoMobile", idAplicacaoMobile));
    

    

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
        return (PageInscricaoAPNResponse) ApiInvoker.deserialize(response, "", PageInscricaoAPNResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salva uma nova inscri\u00E7\u00E3o APN
   * Salva uma nova inscri\u00E7\u00E3o de notifica\u00E7\u00E3o APN do emissor
   * @param inscricaoPersist inscricaoPersist
   * @return List<InscricaoAPNResponse>
   */
  public List<InscricaoAPNResponse>  salvarInscricaoAPN (InscricaoAPN inscricaoPersist) throws ApiException {
    Object postBody = inscricaoPersist;
    
    // verify the required parameter 'inscricaoPersist' is set
    if (inscricaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'inscricaoPersist' when calling salvarInscricaoAPN");
    }
    

    // create path and map variables
    String path = "/api/inscricoes-apn".replaceAll("\\{format\\}","json");

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
        return (List<InscricaoAPNResponse>) ApiInvoker.deserialize(response, "array", InscricaoAPNResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
