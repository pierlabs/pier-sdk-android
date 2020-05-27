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

public class AntecipacaoApi {
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
   * Configura a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite configurar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id Id Produto
   * @param taxaAntecipacaoRequest taxaAntecipacaoRequest
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  configurarTaxaAntecipacaoProduto (Long id, TaxaAntecipacaoRequest taxaAntecipacaoRequest) throws ApiException {
    Object postBody = taxaAntecipacaoRequest;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling configurarTaxaAntecipacaoProduto");
    }
    
    // verify the required parameter 'taxaAntecipacaoRequest' is set
    if (taxaAntecipacaoRequest == null) {
       throw new ApiException(400, "Missing the required parameter 'taxaAntecipacaoRequest' when calling configurarTaxaAntecipacaoProduto");
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
   * Consulta a Taxa de Antecipa\u00E7\u00E3o de um Produto
   * Este recurso permite consultar a Taxa de Antecipa\u00E7\u00E3o de um Produto, a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id Id Produto
   * @param tipoTransacao Tipo da Transa\u00E7\u00E3o (ON-US ou OFF-US)
   * @return ParametroProdutoResponse
   */
  public ParametroProdutoResponse  consultarTaxaAntecipacaoProduto (Long id, String tipoTransacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTaxaAntecipacaoProduto");
    }
    
    // verify the required parameter 'tipoTransacao' is set
    if (tipoTransacao == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoTransacao' when calling consultarTaxaAntecipacaoProduto");
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
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacaoCompra (Long idConta, Long id, Long quantidadeParcelas, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoCompra");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoCompra");
    }
    
    // verify the required parameter 'quantidadeParcelas' is set
    if (quantidadeParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoCompra");
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param quantidadeParcelas Quantidade de parcelas para serem antecipadas
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacaoCompra1 (Long idConta, Long id, Long quantidadeParcelas, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacaoCompra1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling efetivarAntecipacaoCompra1");
    }
    
    // verify the required parameter 'quantidadeParcelas' is set
    if (quantidadeParcelas == null) {
       throw new ApiException(400, "Missing the required parameter 'quantidadeParcelas' when calling efetivarAntecipacaoCompra1");
    }
    

    // create path and map variables
    String path = "/api/saques-antecipaveis/{id}/efetivar-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "quantidadeParcelas", quantidadeParcelas));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o de todas as compras antecip\u00E1veis com todas as parcelas de uma conta
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacoesEmLotes (Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacoesEmLotes");
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Faz a efetiva\u00E7\u00E3o da antecipa\u00E7\u00E3o
   * M\u00E9todo responsavel pela efetiva\u00E7\u00E3o de todas os saques antecip\u00E1veis com todas as parcelas de uma conta
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoResponse
   */
  public AntecipacaoResponse  efetivarAntecipacoesEmLotes1 (Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling efetivarAntecipacoesEmLotes1");
    }
    

    // create path and map variables
    String path = "/api/saques-antecipaveis/efetivar-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Listar compras com parcelas antecip\u00E1veis
   * Lista as compras antecip\u00E1veis de uma conta
   * @param idConta C\u00F3digo identificador da conta da Compra
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCompra C\u00F3digo identificador da Compra
   * @param parcelada Indica se a compra \u00E9 parcelada
   * @param juros Indica se a compra \u00E9 com ou sem juros
   * @param tipoOrigemTransacao Indica se a compra \u00E9 ON-US ou OFF-US
   * @param dataCompraInicio Data de compra(in\u00EDcio)
   * @param dataCompraFim Data de compra(fim)
   * @return PageCompraResponse
   */
  public PageCompraResponse  listarComprasAntecipaveis (Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao, String dataCompraInicio, String dataCompraFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarComprasAntecipaveis");
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraInicio", dataCompraInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraFim", dataCompraFim));
    

    

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
   * Listar saques com parcelas antecip\u00E1veis
   * Lista os saques antecip\u00E1veis de uma conta
   * @param idConta C\u00F3digo identificador da conta da Compra
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idCompra C\u00F3digo identificador da Compra
   * @param parcelada Indica se a compra \u00E9 parcelada
   * @param juros Indica se a compra \u00E9 com ou sem juros
   * @param tipoOrigemTransacao Indica se a compra \u00E9 ON-US ou OFF-US
   * @param dataCompraInicio Data de compra(in\u00EDcio)
   * @param dataCompraFim Data de compra(fim)
   * @return PageCompraResponse
   */
  public PageCompraResponse  listarComprasAntecipaveis1 (Long idConta, List<String> sort, Integer page, Integer limit, Long idCompra, Boolean parcelada, Boolean juros, String tipoOrigemTransacao, String dataCompraInicio, String dataCompraFim) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling listarComprasAntecipaveis1");
    }
    

    // create path and map variables
    String path = "/api/saques-antecipaveis".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraInicio", dataCompraInicio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataCompraFim", dataCompraFim));
    

    

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
   * Simular antecipa\u00E7\u00E3o de parcelas
   * Simula a antecipa\u00E7\u00E3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00EDveis, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse  simularAntecipacaoCompra (Long idConta, Long id, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoCompra");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoCompra");
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Simular antecipa\u00E7\u00E3o de parcelas
   * Simula a antecipa\u00E7\u00E3o de parcelas de um evento, listando todos os planos de parcelamento dispon\u00EDveis, cujo desconto \u00E9 calculado baseado na data da \u00FAltima parcela em aberto
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param id C\u00F3digo de Identifica\u00E7\u00E3o do evento
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaResponse
   */
  public AntecipacaoSimuladaResponse  simularAntecipacaoCompra1 (Long idConta, Long id, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacaoCompra1");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling simularAntecipacaoCompra1");
    }
    

    // create path and map variables
    String path = "/api/saques-antecipaveis/{id}/simular-antecipacao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
   * Simular antecipa\u00E7\u00E3o de todas as parcelas antecip\u00E1veis
   * O recurso permite realizar a simula\u00E7\u00E3o da antecipa\u00E7\u00E3o de todas as compras antecip\u00E1veis de todas as parcelas de uma determinada conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaLoteResponse
   */
  public AntecipacaoSimuladaLoteResponse  simularAntecipacoesEmLote (Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacoesEmLote");
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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
  
  /**
   * Simular antecipa\u00E7\u00E3o de todas as parcelas antecip\u00E1veis
   * O recurso permite realizar a simula\u00E7\u00E3o da antecipa\u00E7\u00E3o de todas os saques antecip\u00E1veis de todas as parcelas de uma determinada conta
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param complemento Dados complementares sobre a realiza\u00E7\u00E3o da transa\u00E7\u00E3o
   * @param juros Indica o tipo de evento pesquisado: 0 = Sem juros, 1 = Com juros, 2 = ambos. O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 0 (sem juros)
   * @param parcelado Indica se o evento pesquisado deve ser parcelado. 0 = Sem ser parcelado, 1 = parcelado, 2 = ambos.  O valor padr\u00E3o para caso o campo n\u00E3o for informado \u00E9 1 (parcelado)
   * @return AntecipacaoSimuladaLoteResponse
   */
  public AntecipacaoSimuladaLoteResponse  simularAntecipacoesEmLote1 (Long idConta, String complemento, Integer juros, Integer parcelado) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling simularAntecipacoesEmLote1");
    }
    

    // create path and map variables
    String path = "/api/saques-antecipaveis/simular-antecipacao".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "juros", juros));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "parcelado", parcelado));
    

    

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
