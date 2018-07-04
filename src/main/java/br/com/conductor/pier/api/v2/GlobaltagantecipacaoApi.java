package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ParametroProdutoResponse;
import br.com.conductor.pier.api.v2.model.TaxaAntecipacaoRequest;
import br.com.conductor.pier.api.v2.model.AntecipacaoResponse;
import br.com.conductor.pier.api.v2.model.PageCompraResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaResponse;
import br.com.conductor.pier.api.v2.model.AntecipacaoSimuladaLoteResponse;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class GlobaltagantecipacaoApi {
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
   * {{{produto_resource_configurar_taxa_antecipacao}}}
   * {{{produto_resource_configurar_taxa_antecipacao_notes}}}
   * @param id {{{produto_resource_configurar_taxa_antecipacao_param_id}}}
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  configurarTaxaAntecipacaoUsingPOST (Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'taxaAntecipacaoRequest' is set
    if (taxaAntecipacaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}/configurar-taxa-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (ParametroProdutoResponse) ApiInvoker.deserialize(response, "", ParametroProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{produto_resource_consultar_taxa_antecipacao}}}
   * {{{produto_resource_consultar_taxa_antecipacao_notes}}}
   * @param id {{{produto_resource_consultar_taxa_antecipacao_param_id}}}
   * @param tipoTransacao {{{produto_resource_consultar_taxa_antecipacao_param_tipo_transacao}}}
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  consultarTaxaAntecipacaoUsingGET (Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoUsingGET");
    }
    
    // verify the required parameter 'tipoTransacao' is set
    if (tipoTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/produtos/{id}/consultar-taxa-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoTransacao", tipoTransacao));
    

    

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
        return (ParametroProdutoResponse) ApiInvoker.deserialize(response, "", ParametroProdutoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_antecipavel_resource_efetivar_antecipacao}}}
   * {{{compra_antecipavel_resource_efetivar_antecipacao_notes}}}
   * @param idConta {{{compra_antecipavel_resource_efetivar_antecipacao_param_id_conta}}}
   * @param id {{{compra_antecipavel_resource_efetivar_antecipacao_param_id_compra}}}
   * @param quantidadeParcelas {{{compra_antecipavel_resource_efetivar_antecipacao_param_quantidade_parcelas}}}
   * @param complemento {{{compra_antecipavel_resource_efetivar_antecipacao_param_complemento}}}
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacaoUsingPOST (Long idConta, Long id, Long quantidadeParcelas, String complemento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoUsingPOST");
    }
    
    // verify the required parameter 'quantidadeParcelas' is set
    if (quantidadeParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    

    

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
        return (AntecipacaoResponse) ApiInvoker.deserialize(response, "", AntecipacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_antecipavel_resource_efetivar_antecipacoes}}}
   * {{{compra_antecipavel_resource_efetivar_antecipacoes_notes}}}
   * @param idConta {{{compra_antecipavel_resource_efetivar_antecipacoes_param_id_conta}}}
   * @param complemento {{{compra_antecipavel_resource_efetivar_antecipacoes_param_complemento}}}
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacoesUsingPOST (Long idConta, String complemento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacoesUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/efetivar-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    

    

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
        return (AntecipacaoResponse) ApiInvoker.deserialize(response, "", AntecipacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_antecipavel_resource_listar}}}
   * {{{compra_antecipavel_resource_listar_notes}}}
   * @param idConta {{{compra_d_t_o_id_conta_value}}}
   * @param sort {{{global_menssagem_sort_sort}}}
   * @param page {{{global_menssagem_sort_page_value}}}
   * @param limit {{{global_menssagem_sort_limit}}}
   * @param idCompra {{{compra_d_t_o_id_compra_value}}}
   * @param parcelada {{{compra_d_t_o_parcelada_value}}}
   * @param juros {{{compra_d_t_o_juros_value}}}
   * @param tipoOrigemTransacao {{{compra_d_t_o_tipo_origem_transacao_value}}}
   * @return PageCompraResponse
   */
  public PageCompraResponse  listarUsingGET13 (Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarUsingGET13");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCompra", idCompra));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelada", parcelada));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoOrigemTransacao", tipoOrigemTransacao));
    

    

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
        return (PageCompraResponse) ApiInvoker.deserialize(response, "", PageCompraResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_antecipavel_resource_simular_antecipacao}}}
   * {{{compra_antecipavel_resource_simular_antecipacao_notes}}}
   * @param idConta {{{compra_antecipavel_resource_simular_antecipacao_param_id_conta}}}
   * @param id {{{compra_antecipavel_resource_simular_antecipacao_param_id_evento}}}
   * @param complemento {{{compra_antecipavel_resource_simular_antecipacao_param_complemento}}}
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse  simularAntecipacaoUsingGET (Long idConta, Long id, String complemento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoUsingGET");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/{id}/simular-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    

    

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
        return (AntecipacaoSimuladaResponse) ApiInvoker.deserialize(response, "", AntecipacaoSimuladaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * {{{compra_antecipavel_resource_simular_antecipacoes}}}
   * {{{compra_antecipavel_resource_simular_antecipacoes_notes}}}
   * @param idConta {{{compra_antecipavel_resource_simular_antecipacoes_param_id_conta}}}
   * @param complemento {{{compra_antecipavel_resource_simular_antecipacoes_param_complemento}}}
   * @return AntecipacaoSimuladaLoteResponse
   */
  public AntecipacaoSimuladaLoteResponse  simularAntecipacoesUsingGET (Long idConta, String complemento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacoesUsingGET");
    }
    

    // create path and map variables
    String path = "/api/compras-antecipaveis/simular-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    

    

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
        return (AntecipacaoSimuladaLoteResponse) ApiInvoker.deserialize(response, "", AntecipacaoSimuladaLoteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
