package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PageBinResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltagbinApi {
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
   * {{{Bin_resource_listar_bins}}}
   * {{{Bin_resource_listar_Bin_notes}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param id {{{bin_request_id_value}}}
   * @param proximaConta {{{bin_request_proximaconta_value}}}
   * @param flagCartaoVirtual {{{bin_request_flagcartaocirtual_value}}}
   * @param flagProvisorio {{{bin_request_flagprovisorio_value}}}
   * @param serviceCode {{{bin_request_servicecode_value}}}
   * @return PageBinResponse
   */
  public PageBinResponse  listarBinUsingGET (List<String> sort, Integer page, Integer limit, Long id, Long proximaConta, Integer flagCartaoVirtual, Integer flagProvisorio, Integer serviceCode) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/bins".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "proximaConta", proximaConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagCartaoVirtual", flagCartaoVirtual));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "serviceCode", serviceCode));
    

    

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
        return (PageBinResponse) ApiInvoker.deserialize(response, "", PageBinResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
