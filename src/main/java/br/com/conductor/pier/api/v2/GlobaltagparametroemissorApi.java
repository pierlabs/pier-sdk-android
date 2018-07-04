package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ParametroEmissorResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagparametroemissorApi {
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
   * {{{parametro_emissor_recurso}}}
   * {{{parametro_emissor_recurso_notas}}}
   * @param codigo {{{parametro_emissor_recurso_pesquisa_codigo_param}}}
   * @return ParametroEmissorResponse
   */
  public ParametroEmissorResponse  consultarUsingGET26 (String codigo) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'codigo' is set
    if (codigo == null) {
       throw new ApiException(400, "Missing the required parameter 'codigo' when calling consultarUsingGET26");
    }
    

    // create path and map variables
    String path = "/api/parametros-emissor/{codigo}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "codigo" + "\\}", apiInvoker.escapeString(codigo.toString()));

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
        return (ParametroEmissorResponse) ApiInvoker.deserialize(response, "", ParametroEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

