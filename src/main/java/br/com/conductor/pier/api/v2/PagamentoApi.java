package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.PagamentosInvalidosResponse;
import br.com.conductor.pier.api.v2.model.PageHistoricoPagamentoResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PagePagamentosInvalidosResponse;
import br.com.conductor.pier.api.v2.model.RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido;
import br.com.conductor.pier.api.v2.model.RegularizacaoPagamentoPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class PagamentoApi {
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
   * Consultar pagamento inv\u00E1lido
   * Esse recurso permite consultar um pagamento inv\u00E1lido a partir do seu c\u00F3digo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do pagamento inv\u00E1lido
   * @return PagamentosInvalidosResponse
   */
  public PagamentosInvalidosResponse  consultarPagamentoInvalido (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarPagamentoInvalido");
    }
    

    // create path and map variables
    String path = "/api/pagamentos-invalidos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PagamentosInvalidosResponse) ApiInvoker.deserialize(response, "", PagamentosInvalidosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista hist\u00F3rico de pagamentos
   * Este recurso permite listar todos os Pagamentos realizados independente do seu Status de Processamento
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da Conta
   * @param idPagamento C\u00F3digo de Identifica\u00E7\u00E3o do Pagamento
   * @param idEstabelecimento C\u00F3digo de Identifica\u00E7\u00E3o do Estabelecimento onde o Pagamento foi realizado, quando este for o local de pagamento
   * @param idBanco C\u00F3digo de Identifica\u00E7\u00E3o da Institui\u00E7\u00E3o Banc\u00E1ria onde o Pagamento foi realizado, quando este for o local de pagamento
   * @param idCartao C\u00F3digo de Identifica\u00E7\u00E3o do Cart\u00E3o
   * @param dataHoraPagamento Data e Hora da realiza\u00E7\u00E3o do Pagamento. Quando feito em Institui\u00E7\u00E3o Banc\u00E1ria, o hor\u00E1rio do pagamento \u00E9 exibido com valor zero
   * @param status C\u00F3digo de Identifica\u00E7\u00E3o do Status do Pagamento
   * @return PageHistoricoPagamentoResponse
   */
  public PageHistoricoPagamentoResponse  listarPagamentos (List<String> sort, Integer page, Integer limit, Long idConta, Long idPagamento, Long idEstabelecimento, Long idBanco, Long idCartao, String dataHoraPagamento, Long status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pagamentos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPagamento", idPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idBanco", idBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idCartao", idCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraPagamento", dataHoraPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (PageHistoricoPagamentoResponse) ApiInvoker.deserialize(response, "", PageHistoricoPagamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar pagamentos inv\u00E1lidos
   * Esse recurso permite listar os pagamentos inv\u00E1lidos na base do emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param banco C\u00F3digo de identifica\u00E7\u00E3o do banco
   * @param dataPagamento Data de pagamento do boleto
   * @param valorPago Valor pago da fatura
   * @param descricao Descri\u00E7\u00E3o do erro ocorrido durante a importa\u00E7\u00E3o do pagamento
   * @return PagePagamentosInvalidosResponse
   */
  public PagePagamentosInvalidosResponse  listarPagamentosInvalidos (List<String> sort, Integer page, Integer limit, Long banco, String dataPagamento, BigDecimal valorPago, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pagamentos-invalidos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "banco", banco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataPagamento", dataPagamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorPago", valorPago));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (PagePagamentosInvalidosResponse) ApiInvoker.deserialize(response, "", PagePagamentosInvalidosResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Regularizar um pagamento inv\u00E1lido
   * Esse recurso permite regularizar os pagamentos inv\u00E1lidos na base do emissor
   * @param id id
   * @param persistDto persistDto
   * @return RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido
   */
  public RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido  regularizar (Long id, RegularizacaoPagamentoPersist persistDto) throws ApiException {
    Object postBody = persistDto;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling regularizar");
    }
    
    // verify the required parameter 'persistDto' is set
    if (persistDto == null) {
       throw new ApiException(400, "Missing the required parameter 'persistDto' when calling regularizar");
    }
    

    // create path and map variables
    String path = "/api/pagamentos-invalidos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido) ApiInvoker.deserialize(response, "", RepresentaUmObjetoDeRespostaParaRegularizarUmPagamentoInvlido.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
