package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.InscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.PageInscricaoAPNResponse;
import br.com.conductor.pier.api.v2.model.InscricaoApnPersistencia;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltaginscricaoapnApi {
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
   * {{{inscricao_apn_recurso_desativar}}}
   * {{{inscricao_apn_recurso_desativar_notas}}}
   * @param id id
   * @return InscricaoAPNResponse
   */
  public InscricaoAPNResponse  desativarUsingPUT (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarUsingPUT");
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
   * {{{inscricao_apn_recurso_listar}}}
   * {{{inscricao_apn_recurso_listar_notas}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param idCartoes {{{inscricao_apn_requisicao_id_cartoes_descricao}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param deviceToken {{{inscricao_apn_requisicao_device_token_descricao}}}
   * @param dataCriacao {{{inscricao_apn_requisicao_data_criacao_descricao}}}
   * @param dataDesativacao {{{inscricao_apn_requisicao_data_desativacao_descricao}}}
   * @param ativo {{{inscricao_apn_requisicao_ativo_descricao}}}
   * @param idAplicacaoMobile {{{inscricao_apn_requisicao_id_aplicacao_mobile_descricao}}}
   * @return PageInscricaoAPNResponse
   */
  public PageInscricaoAPNResponse  listarUsingGET30 (List<String> sort, List<Long> idCartoes, Integer page, Integer limit, String deviceToken, String dataCriacao, String dataDesativacao, Boolean ativo, Long idAplicacaoMobile) throws ApiException {
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
   * {{{inscricao_apn_recurso_salvar}}}
   * {{{inscricao_apn_recurso_salvar_notas}}}
   * @param inscricaoPersist inscricaoPersist
   * @return List<InscricaoAPNResponse>
   */
  public List<InscricaoAPNResponse>  salvarUsingPOST14 (InscricaoApnPersistencia inscricaoPersist) throws ApiException {
    Object postBody = inscricaoPersist;
    
    // verify the required parameter 'inscricaoPersist' is set
    if (inscricaoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'inscricaoPersist' when calling salvarUsingPOST14");
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

