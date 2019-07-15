package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LogRequisicaoMobilePartialUpdate;
import br.com.conductor.pier.api.v2.model.LogRequisicaoMobileResponse;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioResponse;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioPersist;
import br.com.conductor.pier.api.v2.model.LogRequisicaoMobilePersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class LogApi {
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
   * Atualizar parcialmente o log de requisi\u00E7\u00E3o mobile
   * Atualiza parcialmente as informa\u00E7\u00F5es adicionais da requisi\u00E7\u00E3o de um dispositivo m\u00F3vel
   * @param id Identifica\u00E7\u00E3o do registro
   * @param logRequisicao logRequisicao
   * @return LogRequisicaoMobileResponse
   */
  public LogRequisicaoMobileResponse  atualizarParcialmenteLogRequisicaoMobile (Long id, LogRequisicaoMobilePartialUpdate logRequisicao) throws ApiException {
    Object postBody = logRequisicao;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarParcialmenteLogRequisicaoMobile");
    }
    
    // verify the required parameter 'logRequisicao' is set
    if (logRequisicao == null) {
       throw new ApiException(400, "Missing the required parameter 'logRequisicao' when calling atualizarParcialmenteLogRequisicaoMobile");
    }
    

    // create path and map variables
    String path = "/api/logs/requisicoes-mobile/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PATCH", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (LogRequisicaoMobileResponse) ApiInvoker.deserialize(response, "", LogRequisicaoMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Salva os registros parametrizados
   * Este recurso permite salvar os registros parametrizados
   * @param logAcessoUsuarioPersist logAcessoUsuarioPersist
   * @return LogAcessoUsuarioResponse
   */
  public LogAcessoUsuarioResponse  salvarLogAcessoUsuario (LogAcessoUsuarioPersist logAcessoUsuarioPersist) throws ApiException {
    Object postBody = logAcessoUsuarioPersist;
    
    // verify the required parameter 'logAcessoUsuarioPersist' is set
    if (logAcessoUsuarioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'logAcessoUsuarioPersist' when calling salvarLogAcessoUsuario");
    }
    

    // create path and map variables
    String path = "/api/logs/log-acessos-usuario".replaceAll("\\{format\\}","json");

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
        return (LogAcessoUsuarioResponse) ApiInvoker.deserialize(response, "", LogAcessoUsuarioResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra o log requisi\u00E7\u00E3o mobile
   * Cadastra registros da requisi\u00E7\u00E3o de um dispositivo m\u00F3vel
   * @param logRequisicaoMobilePersist logRequisicaoMobilePersist
   * @return LogRequisicaoMobileResponse
   */
  public LogRequisicaoMobileResponse  salvarLogRequisicaoMobile (LogRequisicaoMobilePersist logRequisicaoMobilePersist) throws ApiException {
    Object postBody = logRequisicaoMobilePersist;
    
    // verify the required parameter 'logRequisicaoMobilePersist' is set
    if (logRequisicaoMobilePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'logRequisicaoMobilePersist' when calling salvarLogRequisicaoMobile");
    }
    

    // create path and map variables
    String path = "/api/logs/requisicoes-mobile".replaceAll("\\{format\\}","json");

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
        return (LogRequisicaoMobileResponse) ApiInvoker.deserialize(response, "", LogRequisicaoMobileResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
