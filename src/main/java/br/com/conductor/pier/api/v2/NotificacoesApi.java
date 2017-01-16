package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.SMS;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class NotificacoesApi {
  String basePath = "https://localhost/";
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
   * Atualizar SMS
   * Esse recurso permite atualizar o status do SMS do emissor
   * @param seuNum Seu n\u00C3\u00BAmero
   * @param status Status
   * @param data Data
   * @param textoStatus TextoStatus
   * @param operadora Operadora
   * @return SMS
   */
  public SMS  atualizarSMSUsingPUT (String seuNum, String status, String data, String textoStatus, String operadora) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'seuNum' is set
    if (seuNum == null) {
       throw new ApiException(400, "Missing the required parameter 'seuNum' when calling atualizarSMSUsingPUT");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
       throw new ApiException(400, "Missing the required parameter 'status' when calling atualizarSMSUsingPUT");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
       throw new ApiException(400, "Missing the required parameter 'data' when calling atualizarSMSUsingPUT");
    }
    
    // verify the required parameter 'textoStatus' is set
    if (textoStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'textoStatus' when calling atualizarSMSUsingPUT");
    }
    
    // verify the required parameter 'operadora' is set
    if (operadora == null) {
       throw new ApiException(400, "Missing the required parameter 'operadora' when calling atualizarSMSUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/sms/atualizar-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "SeuNum", seuNum));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Status", status));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Data", data));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "TextoStatus", textoStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Operadora", operadora));
    

    

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
        return (SMS) ApiInvoker.deserialize(response, "", SMS.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Responder SMS
   * Esse recurso permite atualizar a resposta do SMS, fornecida pedo usu\u00C3\u00A1rio
   * @param seunum Seu n\u00C3\u00BAmero
   * @param data Data
   * @param textoSmsMo TextoStatus
   * @return SMS
   */
  public SMS  responderSMSUsingPUT (String seunum, String data, String textoSmsMo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'seunum' is set
    if (seunum == null) {
       throw new ApiException(400, "Missing the required parameter 'seunum' when calling responderSMSUsingPUT");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
       throw new ApiException(400, "Missing the required parameter 'data' when calling responderSMSUsingPUT");
    }
    
    // verify the required parameter 'textoSmsMo' is set
    if (textoSmsMo == null) {
       throw new ApiException(400, "Missing the required parameter 'textoSmsMo' when calling responderSMSUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/notificacoes/sms/responder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Seunum", seunum));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "Data", data));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "TextoSmsMo", textoSmsMo));
    

    

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
        return (SMS) ApiInvoker.deserialize(response, "", SMS.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

