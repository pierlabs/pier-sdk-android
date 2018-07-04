package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PageStatusContestacaoResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagstatuscontestacaoApi {
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
   * {{{status_contestacao_resource_listar_status_contestacao}}}
   * {{{status_contestacao_resource_listar_status_contestacao_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idStatusContestacao {{{status_contestacao_request_idstatuscontestacao_value}}}
   * @param idStatusContestacaoOrigem {{{status_contestacao_request_idstatuscontestacaoOrigem_value}}}
   * @param descricao {{{status_contestacao_request_descricao_value}}}
   * @param flagPermiteAlteracao {{{status_contestacao_request_flagpermitealteracao_value}}}
   * @param flagSistema {{{status_contestacao_request_flagsistema_value}}}
   * @param flagAtivo {{{status_contestacao_request_flagativo_value}}}
   * @return PageStatusContestacaoResponse
   */
  public PageStatusContestacaoResponse  listarStatusContestacaoUsingGET (List<String> sort, Integer page, Integer limit, Long idStatusContestacao, Long idStatusContestacaoOrigem, String descricao, Integer flagPermiteAlteracao, Integer flagSistema, Integer flagAtivo) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/status-contestacoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusContestacao", idStatusContestacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusContestacaoOrigem", idStatusContestacaoOrigem));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagPermiteAlteracao", flagPermiteAlteracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagSistema", flagSistema));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtivo", flagAtivo));
    

    

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
        return (PageStatusContestacaoResponse) ApiInvoker.deserialize(response, "", PageStatusContestacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

